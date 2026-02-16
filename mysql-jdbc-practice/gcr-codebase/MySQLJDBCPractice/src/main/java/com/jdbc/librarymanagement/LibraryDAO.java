package com.jdbc.librarymanagement;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {

    // 📚 View Inventory
    public void viewBooks() {
        String sql = "SELECT * FROM books";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("book_id") +
                        " | Title: " + rs.getString("title") +
                        " | Author: " + rs.getString("author") +
                        " | Available: " + rs.getInt("available_copies")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 🔥 Borrow Book (Transaction)
    public boolean borrowBook(int studentId, int bookId) {

        Connection conn = null;

        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);

            // Check availability
            String checkSql = "SELECT available_copies FROM books WHERE book_id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setInt(1, bookId);
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next() || rs.getInt("available_copies") <= 0) {
                conn.rollback();
                System.out.println("Book not available!");
                return false;
            }

            // Reduce copy
            String updateSql =
                    "UPDATE books SET available_copies = available_copies - 1 WHERE book_id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setInt(1, bookId);
            updateStmt.executeUpdate();

            // Insert borrow record
            String insertSql =
                    "INSERT INTO borrow_records (student_id, book_id, borrow_date) VALUES (?, ?, CURDATE())";
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setInt(1, studentId);
            insertStmt.setInt(2, bookId);
            insertStmt.executeUpdate();

            conn.commit();
            return true;

        } catch (SQLException e) {
            try { if (conn != null) conn.rollback(); }
            catch (SQLException ex) { ex.printStackTrace(); }
            e.printStackTrace();
            return false;

        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    // 🔥 Return Book + Fine Calculation
    public boolean returnBook(int recordId) {

        String selectSql = "SELECT borrow_date, book_id FROM borrow_records WHERE record_id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(selectSql)) {

            pstmt.setInt(1, recordId);
            ResultSet rs = pstmt.executeQuery();

            if (!rs.next()) return false;

            LocalDate borrowDate = rs.getDate("borrow_date").toLocalDate();
            int bookId = rs.getInt("book_id");

            long days = ChronoUnit.DAYS.between(borrowDate, LocalDate.now());
            double fine = days > 7 ? (days - 7) * 10 : 0;

            // Update return info
            String updateSql =
                    "UPDATE borrow_records SET return_date = CURDATE(), fine = ? WHERE record_id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setDouble(1, fine);
            updateStmt.setInt(2, recordId);
            updateStmt.executeUpdate();

            // Increase available copy
            String bookUpdate =
                    "UPDATE books SET available_copies = available_copies + 1 WHERE book_id = ?";
            PreparedStatement bookStmt = conn.prepareStatement(bookUpdate);
            bookStmt.setInt(1, bookId);
            bookStmt.executeUpdate();

            System.out.println("Fine: " + fine);
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 🔎 Search with Multiple Filters
    public void searchBooks(String title, String author, String category) {

        String sql = "SELECT * FROM books WHERE 1=1";

        if (!title.isEmpty()) sql += " AND title LIKE '%" + title + "%'";
        if (!author.isEmpty()) sql += " AND author LIKE '%" + author + "%'";
        if (!category.isEmpty()) sql += " AND category LIKE '%" + category + "%'";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        rs.getString("category")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

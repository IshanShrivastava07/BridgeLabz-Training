package com.jdbc.transactionmanagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankingDAO {

    // 🔥 Transfer using Transaction
    public boolean transferMoney(int fromId, int toId, double amount) {

        Connection conn = null;

        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false); // START TRANSACTION

            // Check balance
            String checkSql = "SELECT balance FROM accounts WHERE account_id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setInt(1, fromId);
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next() || rs.getDouble("balance") < amount) {
                conn.rollback();
                System.out.println("Insufficient balance!");
                return false;
            }

            // Deduct
            String deductSql =
                    "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
            PreparedStatement deductStmt = conn.prepareStatement(deductSql);
            deductStmt.setDouble(1, amount);
            deductStmt.setInt(2, fromId);
            deductStmt.executeUpdate();

            // Add
            String addSql =
                    "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";
            PreparedStatement addStmt = conn.prepareStatement(addSql);
            addStmt.setDouble(1, amount);
            addStmt.setInt(2, toId);
            addStmt.executeUpdate();

            // Insert history
            String historySql =
                    "INSERT INTO transactions (from_account, to_account, amount) VALUES (?, ?, ?)";
            PreparedStatement historyStmt = conn.prepareStatement(historySql);
            historyStmt.setInt(1, fromId);
            historyStmt.setInt(2, toId);
            historyStmt.setDouble(3, amount);
            historyStmt.executeUpdate();

            conn.commit(); // SUCCESS
            return true;

        } catch (SQLException e) {
            try {
                if (conn != null) conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
            return false;

        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // ✅ Check Balance
    public double checkBalance(int accountId) {

        String sql = "SELECT balance FROM accounts WHERE account_id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, accountId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next())
                return rs.getDouble("balance");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    // ✅ Transaction History
    public List<String> getTransactionHistory(int accountId) {

        List<String> list = new ArrayList<>();

        String sql =
                "SELECT * FROM transactions WHERE from_account = ? OR to_account = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, accountId);
            pstmt.setInt(2, accountId);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                list.add(
                        "TxnID: " + rs.getInt("transaction_id") +
                                " | From: " + rs.getInt("from_account") +
                                " | To: " + rs.getInt("to_account") +
                                " | Amount: " + rs.getDouble("amount") +
                                " | Date: " + rs.getTimestamp("transaction_date")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}

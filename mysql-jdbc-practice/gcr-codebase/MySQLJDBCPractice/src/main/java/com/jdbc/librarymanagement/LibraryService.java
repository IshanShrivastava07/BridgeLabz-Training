package com.jdbc.librarymanagement;

import java.util.Scanner;

public class LibraryService {

    private LibraryDAO dao = new LibraryDAO();
    private Scanner scanner;

    public LibraryService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void viewBooks() {
        dao.viewBooks();
    }

    public void borrowBook() {
        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();
        System.out.print("Book ID: ");
        int bookId = scanner.nextInt();

        if (dao.borrowBook(studentId, bookId))
            System.out.println("Book borrowed successfully!");
        else
            System.out.println("Borrow failed!");
    }

    public void returnBook() {
        System.out.print("Record ID: ");
        int recordId = scanner.nextInt();

        if (dao.returnBook(recordId))
            System.out.println("Book returned!");
        else
            System.out.println("Return failed!");
    }

    public void searchBooks() {
        scanner.nextLine();
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Category: ");
        String category = scanner.nextLine();

        dao.searchBooks(title, author, category);
    }
}

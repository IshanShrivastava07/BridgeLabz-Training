package com.jdbc.librarymanagement;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LibraryService service = new LibraryService(scanner);

        boolean running = true;

        while (running) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: service.viewBooks(); break;
                case 2: service.borrowBook(); break;
                case 3: service.returnBook(); break;
                case 4: service.searchBooks(); break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}

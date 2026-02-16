package com.jdbc.transactionmanagement;

import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankingService service = new BankingService(scanner);

        boolean running = true;

        while (running) {

            System.out.println("\n===== Banking System =====");
            System.out.println("1. Transfer Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Transaction History");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    service.transferMoney();
                    break;

                case 2:
                    service.checkBalance();
                    break;

                case 3:
                    service.transactionHistory();
                    break;

                case 4:
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

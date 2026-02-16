package com.jdbc.transactionmanagement;

import java.util.List;
import java.util.Scanner;

public class BankingService {

    private BankingDAO dao = new BankingDAO();
    private Scanner scanner;

    public BankingService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void transferMoney() {
        System.out.print("From Account ID: ");
        int from = scanner.nextInt();
        System.out.print("To Account ID: ");
        int to = scanner.nextInt();
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();

        if (dao.transferMoney(from, to, amount))
            System.out.println("Transfer successful!");
        else
            System.out.println("Transfer failed!");
    }

    public void checkBalance() {
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        System.out.println("Balance: " + dao.checkBalance(id));
    }

    public void transactionHistory() {
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        List<String> list = dao.getTransactionHistory(id);
        list.forEach(System.out::println);
    }
}

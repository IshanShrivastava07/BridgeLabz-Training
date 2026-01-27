package com.exceptionhandling.banktransactionsystem;

public class BankTransaction {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(2000);     // try 6000 or -100 for testing

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

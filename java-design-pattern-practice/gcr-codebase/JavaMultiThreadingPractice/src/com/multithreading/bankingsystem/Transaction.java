package com.multithreading.bankingsystem;

class Transaction implements Runnable {
    private BankAccount account;
    private int amount;

    Transaction(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        System.out.println("[" + Thread.currentThread().getName() +
                "] Attempting to withdraw " + amount);

        boolean success = account.withdraw(amount);
        if (success) {
            System.out.println("Transaction successful: " +
                    Thread.currentThread().getName() +
                    ", Amount: " + amount +
                    ", Balance: " + account.balance);
        } else {
            System.out.println("Transaction failed: " +
                    Thread.currentThread().getName());
        }
    }
}

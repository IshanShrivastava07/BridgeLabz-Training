package com.exceptionhandling.banktransactionsystem;

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount < 0) {
            // unchecked exception
            throw new IllegalArgumentException("Invalid amount!");
        }

        if (amount > balance) {
            // checked custom exception
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

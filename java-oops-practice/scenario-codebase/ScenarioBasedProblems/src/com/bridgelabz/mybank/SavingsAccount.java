package com.bridgelabz.mybank;

public class SavingsAccount extends Account implements ITransaction {

    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance())
            setBalance(getBalance() - amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Savings Balance: ₹" + getBalance());
    }
}

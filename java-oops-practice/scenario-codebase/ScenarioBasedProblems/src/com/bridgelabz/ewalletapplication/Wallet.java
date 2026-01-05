package com.bridgelabz.ewalletapplication;

public class Wallet {
    private double balance;

    public Wallet(double bonus) {
        balance = bonus;
    }

    protected void addMoney(double amount) {
        balance += amount;
    }

    protected void deduct(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

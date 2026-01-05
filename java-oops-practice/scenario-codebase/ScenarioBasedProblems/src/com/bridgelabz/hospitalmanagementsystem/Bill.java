package com.bridgelabz.hospitalmanagementsystem;

public class Bill implements Payable {
    private double amount;

    public Bill(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount + (amount * 0.05);
    }
}


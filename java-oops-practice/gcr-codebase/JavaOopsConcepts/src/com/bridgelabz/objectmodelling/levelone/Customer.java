package com.bridgelabz.objectmodelling.levelone;

public class Customer {
    String name;
    double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }
}

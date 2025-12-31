package com.bridgelabz.objectmodelling.levelone;

public class Bank {
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer customer) {
        System.out.println(customer.name + " opened account in " + bankName);
    }
}

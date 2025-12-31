package com.bridgelabz.objectmodelling.levelone;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank("SBI");
        Customer customer = new Customer("Ishan", 5000);

        bank.openAccount(customer);
        customer.viewBalance();
    }
}

package com.bridgelabz.constructor.levelone;

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(123, "Ishan", 5000);
        sa.setBalance(8000);
        System.out.println(sa.accountNumber + " " + sa.accountHolder + " " + sa.getBalance());
    }
}

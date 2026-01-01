package com.bridgelabz.inheritance;

public class BankMain {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "SA101";
        sa.balance = 50000;
        sa.interestRate = 4.5;

        CheckingAccount ca = new CheckingAccount();
        ca.accountNumber = "CA201";
        ca.balance = 30000;
        ca.withdrawalLimit = 20000;

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.accountNumber = "FD301";
        fd.balance = 100000;
        fd.tenure = 24;

        sa.displayAccountType();
        ca.displayAccountType();
        fd.displayAccountType();
    }
}

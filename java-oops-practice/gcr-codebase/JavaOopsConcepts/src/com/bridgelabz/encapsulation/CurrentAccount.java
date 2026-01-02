package com.bridgelabz.encapsulation;

// Current account class
public class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    // No interest for current account
    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 10;
    }
}

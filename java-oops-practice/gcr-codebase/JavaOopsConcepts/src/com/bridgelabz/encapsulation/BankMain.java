package com.bridgelabz.encapsulation;

// Main class to test banking system
public class BankMain {

    public static void main(String[] args) {

        // Creating different account types
        BankAccount acc1 = new SavingsAccount("SA101", "Ishan", 50000);
        BankAccount acc2 = new CurrentAccount("CA202", "Rahul", 80000);

        // Store accounts in array (Polymorphism)
        BankAccount[] accounts = { acc1, acc2 };

        // Process accounts dynamically
        for (BankAccount acc : accounts) {

            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: ₹" + acc.getBalance());

            // Interest calculated dynamically
            double interest = acc.calculateInterest();
            System.out.println("Interest Earned: ₹" + interest);

            // Loan processing
            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan();
                System.out.println("Loan Eligibility: ₹" +
                        loanAcc.calculateLoanEligibility());
            }

            System.out.println("----------------------------------");
        }
    }
}

package com.bridgelabz.loanbuddy;

public class LoanBuddyMain {

	public static void main(String[] args) {
		Applicant applicant = new Applicant("Faruk", 720, 90000, 62000);
		Loanapplication loan = new HomeLoan(410);
		
		if(loan.approveLoan(applicant)) {
			double emi = loan.calculateEMI(applicant.getLoanAmount(), 410);
			
			System.out.println("Loan Approved ");
            System.out.println("Applicant: " + applicant.getName());
            System.out.println("Loan Type: Home Loan");
            System.out.println("Monthly EMI: " + emi);
		}
		else {
			System.out.println("Loan Rejected");
		}
	}
}

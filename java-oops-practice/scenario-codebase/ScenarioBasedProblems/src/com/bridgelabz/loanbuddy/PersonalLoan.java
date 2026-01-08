package com.bridgelabz.loanbuddy;

public class PersonalLoan extends Loanapplication {

	public PersonalLoan(int term) {
		super("Personal Loan", term, 0.15);
	}
	
	public double calculateEMI(double Principal, int months) {
		return EMICalculation(Principal, InterestRate, months);
	}
	
	public boolean approveLoan(Applicant applicant) {
		boolean eligible = applicant.getCreditScore() >= 750 && applicant.getIncome() > 25000;
		setApproved(eligible);
		return eligible;
	}
	
}

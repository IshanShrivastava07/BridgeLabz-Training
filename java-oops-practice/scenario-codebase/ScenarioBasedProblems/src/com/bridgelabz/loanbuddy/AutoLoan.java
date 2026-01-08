package com.bridgelabz.loanbuddy;

public class AutoLoan extends Loanapplication {

	public AutoLoan(int term) {
		super("Auto Loan", term, 0.30);
	}
	
	public boolean approveLoan(Applicant applicant) {
		boolean eligible = applicant.getCreditScore() >= 700 && applicant.getIncome() > 80000;
	
		 setApproved(eligible);
		 return eligible;
		
	}
  public double calculateEMI(double Principal, int months) {
	  return EMICalculation(Principal, InterestRate, months);
  }
}
  
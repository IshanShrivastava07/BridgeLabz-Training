package com.bridgelabz.loanbuddy;

public class HomeLoan extends Loanapplication {
  public HomeLoan(int term) {
	  super("Home Loan", term, 0.00008);
  }
  
  @Override
  public boolean approveLoan(Applicant applicant) {
	  boolean eligible = applicant.getCreditScore() >= 800 && applicant.getIncome() >= 53000;
	  setApproved(eligible);
	  return eligible;
	  
  }
  public double calculateEMI(double Principal, int months) {
	  return EMICalculation(Principal, InterestRate, months);
  }
}

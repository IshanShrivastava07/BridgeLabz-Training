package com.bridgelabz.loanbuddy;

public abstract class Loanapplication implements IApprovable {

	protected String loantype;
	protected int term;
	protected double InterestRate;
	
	private boolean approved;
	
	protected Loanapplication(String loantype, int term, double InterestRate) {
		this.loantype = loantype;
		this.term = term;
		this.InterestRate = InterestRate;
	}
	protected void setApproved(boolean status) {
		this.approved = status;
	}
	public boolean isApproved() {
		return approved;
	}
   protected double EMICalculation(double P, double R, int N) {
	   return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N)- 1); 
   }
}

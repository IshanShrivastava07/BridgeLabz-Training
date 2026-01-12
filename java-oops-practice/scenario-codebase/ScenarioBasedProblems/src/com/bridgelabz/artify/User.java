package com.bridgelabz.artify;

public class User {

	private String nameString;
	private double walletBalance;
	
	public User(String nameString, double walletBalance) {
		super();
		this.nameString = nameString;
		this.walletBalance = walletBalance;
	}
	
	public String getName() {
		return nameString;
	}
	
	public void setName(String name) {
		this.nameString = name;
	}
	
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public void deduceBalance(double amount) {
		walletBalance -= amount;
		System.out.println("\nWallet balance deducted");
		System.out.println("Available Balane" + walletBalance);
		
	}
}

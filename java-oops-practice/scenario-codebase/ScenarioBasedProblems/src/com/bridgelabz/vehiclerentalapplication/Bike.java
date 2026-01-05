package com.bridgelabz.vehiclerentalapplication;

public class Bike extends Vehicle  {
	public Bike() {
		super(300);
	}

	public double calculateRent(int days) {
		return baseRate * days;
	}
}

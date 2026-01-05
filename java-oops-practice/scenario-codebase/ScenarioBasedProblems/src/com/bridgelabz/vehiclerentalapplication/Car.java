package com.bridgelabz.vehiclerentalapplication;

public class Car extends Vehicle {
public Car() {
	super(1000);
}
public double calculateRent(int days) {
	return (baseRate * days) + 500;
}
}

package com.bridgelabz.parkease;

public abstract class Vehicle implements IPayable {

    protected String number;
    protected double ratePerHour;

    public Vehicle(String number, double ratePerHour) {
        this.number = number;
        this.ratePerHour = ratePerHour;
    }
}

package com.bridgelabz.vehiclerentalapplication;

public class Truck extends Vehicle {
    public Truck() {
        super(2000);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + 1500;
    }
}


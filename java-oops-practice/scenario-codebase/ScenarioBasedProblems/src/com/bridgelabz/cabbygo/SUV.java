package com.bridgelabz.cabbygo;

public class SUV extends Vehicle {

    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV", 20);
    }

    @Override
    public double calculateFare(double distance) {
        return 120 + distance * ratePerKm;
    }
}


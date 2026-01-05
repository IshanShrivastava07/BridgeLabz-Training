package com.bridgelabz.cabbygo;

public class Sedan extends Vehicle {

    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan", 15);
    }

    @Override
    public double calculateFare(double distance) {
        return 80 + distance * ratePerKm;
    }
}


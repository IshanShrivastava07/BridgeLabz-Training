package com.bridgelabz.cabbygo;

public class Mini extends Vehicle {

    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini", 10);
    }

    @Override
    public double calculateFare(double distance) {
        return 50 + distance * ratePerKm;
    }
}


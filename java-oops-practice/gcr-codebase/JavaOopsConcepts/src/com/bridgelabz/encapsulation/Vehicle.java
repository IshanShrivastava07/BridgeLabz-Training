package com.bridgelabz.encapsulation;

// Abstract class representing a vehicle
public abstract class Vehicle {

    // Private variables (Encapsulation)
    private String vehicleNumber;
    private String type;
    private double rentalRatePerDay;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Getter methods
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    // Setter method
    public void setRentalRatePerDay(double rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Abstract method (implemented by subclasses)
    public abstract double calculateRentalCost(int days);
}

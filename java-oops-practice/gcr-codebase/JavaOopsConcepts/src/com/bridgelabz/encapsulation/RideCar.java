package com.bridgelabz.encapsulation;

// Car ride
public class RideCar extends RideVehicle implements GPS {

    private String currentLocation = "Unknown";

    public RideCar(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // base charge
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

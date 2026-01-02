package com.bridgelabz.encapsulation;

// Bike ride
public class RideBike extends RideVehicle implements GPS {

    private String currentLocation = "Unknown";

    public RideBike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
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

package com.bridgelabz.encapsulation;

// Auto ride
public class RideAuto extends RideVehicle implements GPS {

    private String currentLocation = "Unknown";

    public RideAuto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // base charge
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

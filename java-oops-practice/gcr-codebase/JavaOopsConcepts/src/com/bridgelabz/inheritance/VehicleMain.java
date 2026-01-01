package com.bridgelabz.inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        Car c = new Car();
        c.maxSpeed = 180;
        c.fuelType = "Petrol";
        c.seatCapacity = 5;

        Truck t = new Truck();
        t.maxSpeed = 120;
        t.fuelType = "Diesel";
        t.loadCapacity = 5000;

        vehicles[0] = c;
        vehicles[1] = t;

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}

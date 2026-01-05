package com.bridgelabz.vehiclerentalapplication;

public class VehicleRentalMain {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        Vehicle v3 = new Truck();

        System.out.println(v1.calculateRent(3));
        System.out.println(v2.calculateRent(3));
        System.out.println(v3.calculateRent(3));
    }
}

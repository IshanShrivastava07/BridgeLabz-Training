package com.bridgelabz.inheritance;

public class Car extends Vehicle {
    int seatCapacity;

    @Override
    void displayInfo() {
        System.out.println(maxSpeed + " | " + fuelType + " | Seats: " + seatCapacity);
    }
}

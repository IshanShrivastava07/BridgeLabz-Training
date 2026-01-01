package com.bridgelabz.inheritance;

public class Truck extends Vehicle {
    int loadCapacity;

    @Override
    void displayInfo() {
        System.out.println(maxSpeed + " | " + fuelType + " | Load: " + loadCapacity);
    }
}

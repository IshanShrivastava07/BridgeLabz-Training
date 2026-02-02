package com.functionalinterface.smartvehicledashboard;

interface VehicleMain {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}

class ElectricCar implements VehicleMain {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery: 70%");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        VehicleMain v = new ElectricCar();
        v.displaySpeed();
        v.displayBattery();
    }
}


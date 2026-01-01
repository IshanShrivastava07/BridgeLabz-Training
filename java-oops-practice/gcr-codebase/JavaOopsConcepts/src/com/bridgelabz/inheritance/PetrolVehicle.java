package com.bridgelabz.inheritance;

public class PetrolVehicle extends Vehicle2 implements Refuelable {
    public void refuel() {
        System.out.println("Vehicle refueled");
    }
}

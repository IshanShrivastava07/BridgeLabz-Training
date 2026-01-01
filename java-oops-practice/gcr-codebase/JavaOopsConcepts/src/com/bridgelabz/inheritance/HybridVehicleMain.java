package com.bridgelabz.inheritance;

public class HybridVehicleMain {
    public static void main(String[] args) {

        PetrolVehicle pv = new PetrolVehicle();
        pv.model = "Honda City";
        pv.maxSpeed = 180;
        pv.refuel();

        ElectricVehicle ev = new ElectricVehicle();
        ev.model = "Tesla";
        ev.maxSpeed = 250;
        ev.charge();
    }
}

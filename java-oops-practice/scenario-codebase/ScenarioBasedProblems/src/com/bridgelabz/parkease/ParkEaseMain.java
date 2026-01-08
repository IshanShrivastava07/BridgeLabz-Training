package com.bridgelabz.parkease;

public class ParkEaseMain {
    public static void main(String[] args) {

        ParkingSlot carSlot = new ParkingSlot("A1", "Car");
        ParkingSlot bikeSlot = new ParkingSlot("B1", "Bike");

        Vehicle car = new Car("MH12AB1111");
        Vehicle bike = new Bike("MH12XY2222");

        ParkingLog log = new ParkingLog();

        if (carSlot.park(car)) {
            log.addEntry("Car parked at " + carSlot.getSlotId());
            double charge = car.calculateCharges(4);
            carSlot.leave();
            log.addEntry("Car left from " + carSlot.getSlotId());
            System.out.println("Car charge: " + charge);
        }

        if (bikeSlot.park(bike)) {
            log.addEntry("Bike parked at " + bikeSlot.getSlotId());
            double charge = bike.calculateCharges(2);
            bikeSlot.leave();
            log.addEntry("Bike left from " + bikeSlot.getSlotId());
            System.out.println("Bike charge: " + charge);
        }

        System.out.println("\nParking Logs:");
        log.showLogs();
    }
}


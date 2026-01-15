package com.bridgelabz.trafficmanager;

public class TrafficManager {

    private VehicleNode last; // points to last node

    // add car to roundabout
    public void addCar(String vehicleNo) {
        VehicleNode newNode = new VehicleNode(vehicleNo);

        if (last == null) {
            last = newNode;
            last.next = last;
            return;
        }

        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

    // remove car from roundabout
    public void removeCar() {
        if (last == null) {
            System.out.println("Roundabout empty");
            return;
        }

        if (last.next == last) {
            last = null;
            return;
        }

        last.next = last.next.next;
    }

    // print current state
    public void printRoundabout() {
        if (last == null) {
            System.out.println("Roundabout empty");
            return;
        }

        VehicleNode temp = last.next;
        do {
            System.out.print(temp.vehicleNo + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("(back to start)");
    }
}

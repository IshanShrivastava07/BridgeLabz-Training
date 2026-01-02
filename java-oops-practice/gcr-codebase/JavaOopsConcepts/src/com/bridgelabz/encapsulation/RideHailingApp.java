package com.bridgelabz.encapsulation;

// Main application class
public class RideHailingApp {

    // Polymorphic fare calculation
    public static void calculateFare(RideVehicle[] vehicles, double distance) {

        for (RideVehicle v : vehicles) {

            v.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: ₹" + v.calculateFare(distance));

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("City Center");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {

        RideVehicle v1 = new RideCar("CAR101", "Ramesh", 15);
        RideVehicle v2 = new RideBike("BIKE202", "Suresh", 8);
        RideVehicle v3 = new RideAuto("AUTO303", "Mahesh", 10);

        RideVehicle[] vehicles = { v1, v2, v3 };

        calculateFare(vehicles, 12);
    }
}

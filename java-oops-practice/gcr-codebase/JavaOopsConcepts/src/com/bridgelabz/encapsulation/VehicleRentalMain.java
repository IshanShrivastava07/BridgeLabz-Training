package com.bridgelabz.encapsulation;

// Main class to test vehicle rental system
public class VehicleRentalMain {

    public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle v1 = new Car("MH12AB1234", 2000, "CAR123");
        Vehicle v2 = new Bike("MH14XY5678", 500, "BIKE456");
        Vehicle v3 = new Truck("MH10TR9999", 4000, "TRUCK789");

        // Store vehicles in array
        Vehicle[] vehicles = { v1, v2, v3 };

        int rentalDays = 3;

        // Iterate over vehicles
        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            // Check if vehicle is insurable
            if (v instanceof Insurable) {
                insuranceCost = ((Insurable) v).calculateInsurance();
            }

            // Display details
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: ₹" + rentalCost);
            System.out.println("Insurance Cost: ₹" + insuranceCost);
            System.out.println("Total Cost: ₹" + (rentalCost + insuranceCost));
            System.out.println("----------------------------------");
        }
    }
}

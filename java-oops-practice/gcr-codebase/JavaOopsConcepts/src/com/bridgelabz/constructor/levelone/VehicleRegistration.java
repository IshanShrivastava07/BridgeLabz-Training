package com.bridgelabz.constructor.levelone;

class VehicleRegistration {

    String ownerName;
    String vehicleType;

    static double registrationFee = 1500;

    VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType + " | Fee: ₹" + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        VehicleRegistration v1 = new VehicleRegistration("Ishan", "Bike");
        VehicleRegistration v2 = new VehicleRegistration("Rohan", "Car");

        v1.displayVehicleDetails();
        VehicleRegistration.updateRegistrationFee(2000);
        v2.displayVehicleDetails();
    }
}

package com.bridgelabz.encapsulation;

// Truck class
public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String number, double rate, String policyNumber) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Extra fixed charge for trucks
        return (getRentalRatePerDay() * days) + 1000;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insured (Policy ending with "
                + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3)
                + ")";
    }
}

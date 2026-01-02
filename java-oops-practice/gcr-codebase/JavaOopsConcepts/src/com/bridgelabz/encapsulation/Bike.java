package com.bridgelabz.encapsulation;

// Bike class
public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRatePerDay() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insured (Policy ending with "
                + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3)
                + ")";
    }
}

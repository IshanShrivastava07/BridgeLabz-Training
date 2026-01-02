package com.bridgelabz.encapsulation;

// Car class
public class Car extends Vehicle implements Insurable {

    // Sensitive data (hidden)
    private String insurancePolicyNumber;

    public Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRatePerDay() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    // Controlled access to insurance info
    @Override
    public String getInsuranceDetails() {
        return "Car insured (Policy ending with "
                + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3)
                + ")";
    }
}

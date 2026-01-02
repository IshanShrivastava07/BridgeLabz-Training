package com.bridgelabz.encapsulation;

import java.util.ArrayList;

// In-patient class
public class InPatient extends Patient implements MedicalRecord {

    private int numberOfDays;
    private double roomChargePerDay;

    // Medical history (encapsulated)
    private ArrayList<String> medicalHistory = new ArrayList<>();

    public InPatient(int id, String name, int age,
                     int days, double chargePerDay) {
        super(id, name, age);
        this.numberOfDays = days;
        this.roomChargePerDay = chargePerDay;
    }

    // Billing logic for in-patient
    @Override
    public double calculateBill() {
        return numberOfDays * roomChargePerDay;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

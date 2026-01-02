package com.bridgelabz.encapsulation;

import java.util.ArrayList;

// Out-patient class
public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    // Medical history (encapsulated)
    private ArrayList<String> medicalHistory = new ArrayList<>();

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    // Billing logic for out-patient
    @Override
    public double calculateBill() {
        return consultationFee;
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

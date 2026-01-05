package com.bridgelabz.hospitalmanagementsystem;

public class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(String name, int age, int daysAdmitted) {
        super(name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient | Days Admitted: " + daysAdmitted);
    }
}


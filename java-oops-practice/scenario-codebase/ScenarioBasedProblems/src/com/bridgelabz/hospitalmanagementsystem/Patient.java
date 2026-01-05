package com.bridgelabz.hospitalmanagementsystem;

public abstract class Patient {
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Patient(String name, int age, String medicalHistory) {
        this(name, age);
        this.medicalHistory = medicalHistory;
    }

    public abstract void displayInfo();
}


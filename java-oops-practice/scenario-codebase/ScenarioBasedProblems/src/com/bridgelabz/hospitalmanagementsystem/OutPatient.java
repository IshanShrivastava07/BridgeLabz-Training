package com.bridgelabz.hospitalmanagementsystem;

public class OutPatient extends Patient {

    public OutPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient");
    }
}


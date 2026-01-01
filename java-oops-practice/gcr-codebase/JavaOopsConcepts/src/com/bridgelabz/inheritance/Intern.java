package com.bridgelabz.inheritance;

public class Intern extends Employee {
    int duration;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " months");
    }
}

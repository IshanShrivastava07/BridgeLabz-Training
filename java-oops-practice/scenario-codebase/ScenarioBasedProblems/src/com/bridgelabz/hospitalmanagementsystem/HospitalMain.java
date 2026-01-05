package com.bridgelabz.hospitalmanagementsystem;

public class HospitalMain {
    public static void main(String[] args) {
        Patient p1 = new InPatient("Amit", 45, 5);
        Patient p2 = new OutPatient("Riya", 30);

        p1.displayInfo();
        p2.displayInfo();

        Bill bill = new Bill(10000);
        System.out.println("Total Bill: " + bill.calculatePayment());
    }
}


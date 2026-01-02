package com.bridgelabz.encapsulation;

// Main class to test hospital system
public class HospitalMain {

    public static void main(String[] args) {

        // Polymorphic patient references
        Patient p1 = new InPatient(101, "Amit", 45, 5, 3000);
        Patient p2 = new OutPatient(102, "Neha", 30, 800);

        // Store patients
        Patient[] patients = { p1, p2 };

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Total Bill: ₹" + p.calculateBill());

            // Medical record handling
            if (p instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) p;
                record.addRecord("Routine checkup");
                record.viewRecords();
            }

            System.out.println("--------------------------------");
        }
    }
}

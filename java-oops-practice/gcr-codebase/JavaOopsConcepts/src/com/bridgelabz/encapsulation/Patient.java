package com.bridgelabz.encapsulation;

// Abstract class representing a patient
public abstract class Patient {

    // Basic patient details (Encapsulation)
    private int patientId;
    private String name;
    private int age;

    // Sensitive medical data (hidden)
    private String diagnosis;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter methods (read-only access)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Controlled access to diagnosis
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method
    public abstract double calculateBill();
}

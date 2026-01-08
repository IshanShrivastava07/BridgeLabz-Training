package com.bridgelabz.edumentor;

public class Instructor extends User {

    public Instructor(int userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public void printProfile() {
        System.out.println("Instructor: " + name + " | Email: " + email);
    }
}

package com.bridgelabz.edumentor;

public class Learner extends User {

    public Learner(int userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public void printProfile() {
        System.out.println("Learner: " + name + " | Email: " + email);
    }
}

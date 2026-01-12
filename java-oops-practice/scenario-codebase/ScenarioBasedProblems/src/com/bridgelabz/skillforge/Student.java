package com.bridgelabz.skillforge;

public class Student extends User implements ICertifiable {

    private int progress;

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int value) {
        progress += value;
    }

    @Override
    public void generateCertificate(Course course) {
        System.out.println("Certificate issued to " + name +
                " for completing course: " + course.getTitle());
    }
}

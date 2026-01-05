package com.bridgelabz.universitycoursemanagement;

public abstract class Student {
    private double gpa;

    public abstract void assignGrade();

    public double getTranscript() {
        return gpa;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }
}


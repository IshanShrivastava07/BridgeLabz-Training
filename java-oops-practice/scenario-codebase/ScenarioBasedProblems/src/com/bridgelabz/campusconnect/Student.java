package com.bridgelabz.campusconnect;

public class Student extends Person implements ICourseActions {
    private int[] grades;
    private int gradeCount = 0;

    public Student(int id, String name, String email) {
        super(id, name, email);
        grades = new int[5];
    }

    public void addGrade(int grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount++] = grade;
        }
    }

    public double calculateGPA() {
        int sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return gradeCount == 0 ? 0 : (double) sum / gradeCount;
    }

    @Override
    public void enrollCourse(Course course) {
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        course.removeStudent(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}


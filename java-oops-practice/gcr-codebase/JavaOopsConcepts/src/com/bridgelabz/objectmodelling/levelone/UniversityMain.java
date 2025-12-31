package com.bridgelabz.objectmodelling.levelone;

public class UniversityMain {
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma");

        University uni = new University();
        uni.addDepartment(new Department("Computer Science"));
        uni.addFaculty(f1);

        // Composition: deleting university deletes departments
        uni = null;

        // Aggregation: faculty still exists
        System.out.println(f1.name + " still exists");
    }
}


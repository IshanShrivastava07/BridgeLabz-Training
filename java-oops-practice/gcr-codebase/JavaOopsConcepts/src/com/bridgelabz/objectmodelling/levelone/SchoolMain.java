package com.bridgelabz.objectmodelling.levelone;

public class SchoolMain {
    public static void main(String[] args) {

        Student s1 = new Student("Ishan");
        Course c1 = new Course("Java");

        s1.enrollCourse(c1);

        System.out.println(s1.name + " enrolled in " + c1.name);
    }
}


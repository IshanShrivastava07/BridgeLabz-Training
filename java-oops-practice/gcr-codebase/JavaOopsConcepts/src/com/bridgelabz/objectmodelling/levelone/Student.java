package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.students.add(this);
    }
}

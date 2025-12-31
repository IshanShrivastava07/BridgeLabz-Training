package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

public class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }
}

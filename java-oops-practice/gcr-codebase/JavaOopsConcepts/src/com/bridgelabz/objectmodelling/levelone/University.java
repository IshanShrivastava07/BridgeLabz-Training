package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

//University owns Departments (Composition)
//University aggregates Faculty (Aggregation)
public class University {
 ArrayList<Department> departments = new ArrayList<>();
 ArrayList<Faculty> faculties = new ArrayList<>();

 public void addDepartment(Department d) {
     departments.add(d);
 }

 public void addFaculty(Faculty f) {
     faculties.add(f);
 }
}


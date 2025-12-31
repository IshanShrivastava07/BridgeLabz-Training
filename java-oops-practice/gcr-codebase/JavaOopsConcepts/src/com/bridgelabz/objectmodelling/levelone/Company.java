package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

//Company owns Departments
public class Company {
 String name;
 ArrayList<Department> departments = new ArrayList<>();

 public Company(String name) {
     this.name = name;
 }

 public void addDepartment(Department d) {
     departments.add(d);
 }
}


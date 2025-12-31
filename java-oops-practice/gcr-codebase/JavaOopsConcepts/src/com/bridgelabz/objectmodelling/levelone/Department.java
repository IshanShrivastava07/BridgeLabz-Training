package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

//Department cannot exist without Company
public class Department {
 String name;
 ArrayList<Employee> employees = new ArrayList<>();

 public Department(String name) {
     this.name = name;
 }

 public void addEmployee(Employee e) {
     employees.add(e);
 }
}

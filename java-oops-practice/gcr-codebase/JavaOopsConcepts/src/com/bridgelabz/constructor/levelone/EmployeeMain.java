package com.bridgelabz.constructor.levelone;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager(1, "IT", 60000);
        m.setSalary(90000);
        System.out.println(m.employeeID + " " + m.department + " " + m.getSalary());
    }
}

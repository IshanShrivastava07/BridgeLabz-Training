package com.bridgelabz.encapsulation;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Amit", 40000);
        Employee e2 = new PartTimeEmployee(2, "Riya", 500, 40);

        e1.displayDetails();
        e2.displayDetails();
    }
}

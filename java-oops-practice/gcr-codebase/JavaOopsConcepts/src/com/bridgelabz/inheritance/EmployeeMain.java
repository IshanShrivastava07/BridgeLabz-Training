package com.bridgelabz.inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Ishan";
        d.id = 101;
        d.salary = 50000;
        d.programmingLanguage = "Java";

        d.displayDetails();
    }
}

package com.bridgelabz.objectmodelling.levelone;

public class CompanyMain {
    public static void main(String[] args) {

        Company company = new Company("TechCorp");
        Department dept = new Department("IT");

        dept.addEmployee(new Employee("Amit"));
        company.addDepartment(dept);

        // Composition: deleting company deletes everything
        company = null;
        System.out.println("Company deleted");
    }
}


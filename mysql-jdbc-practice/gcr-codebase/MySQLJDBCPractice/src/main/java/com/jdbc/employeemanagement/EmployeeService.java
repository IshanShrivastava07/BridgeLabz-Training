package com.jdbc.employeemanagement;

import java.util.List;
import java.util.Scanner;

import java.util.List;
import java.util.Scanner;

public class EmployeeService {

    private EmployeeDAO dao = new EmployeeDAO();
    private Scanner scanner;

    public EmployeeService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void addEmployee() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        if (dao.addEmployee(new Employee(name, salary)))
            System.out.println("Employee added successfully!");
        else
            System.out.println("Failed to add employee!");
    }

    public void viewAllEmployees() {
        List<Employee> list = dao.getAllEmployees();

        if (list.isEmpty()) {
            System.out.println("No employees found!");
        } else {
            list.forEach(System.out::println);
        }
    }

    public void updateEmployeeSalary() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter new salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        if (dao.updateSalary(id, salary))
            System.out.println("Salary updated successfully!");
        else
            System.out.println("Employee not found!");
    }

    public void deleteEmployee() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (dao.deleteEmployee(id))
            System.out.println("Employee deleted successfully!");
        else
            System.out.println("Employee not found!");
    }

    public void searchEmployeeByName() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();

        List<Employee> list = dao.searchByName(name);

        if (list.isEmpty())
            System.out.println("No employee found!");
        else
            list.forEach(System.out::println);
    }
}

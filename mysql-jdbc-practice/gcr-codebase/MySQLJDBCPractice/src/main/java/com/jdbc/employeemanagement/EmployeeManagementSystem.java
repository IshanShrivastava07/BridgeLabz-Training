package com.jdbc.employeemanagement;

import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeService service = new EmployeeService(scanner);

        boolean running = true;

        while (running) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee by Name");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    service.addEmployee();
                    break;

                case 2:
                    service.viewAllEmployees();
                    break;

                case 3:
                    service.updateEmployeeSalary();
                    break;

                case 4:
                    service.deleteEmployee();
                    break;

                case 5:
                    service.searchEmployeeByName();
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}



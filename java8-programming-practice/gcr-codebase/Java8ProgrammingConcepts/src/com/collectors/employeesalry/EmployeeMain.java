package com.collectors.employeesalry;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    String getDepartment() { return department; }
    double getSalary() { return salary; }
}

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Ishan", "IT", 60000),
            new Employee("Ravi", "HR", 40000),
            new Employee("Neha", "IT", 70000),
            new Employee("Anita", "HR", 50000),
            new Employee("Amit", "Sales", 45000)
        );

        Map<String, Double> avgSalaryByDept =
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.averagingDouble(Employee::getSalary)
                     ));

        avgSalaryByDept.forEach((dept, avgSalary) ->
            System.out.println(dept + " -> " + avgSalary)
        );
    }
}

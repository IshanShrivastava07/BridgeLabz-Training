package com.collection.map;

import java.util.*;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String toString() {
        return name;
    }
}

public class GroupEmployees {

    public static void main(String[] args) {

      List<Employee> list = Arrays.asList(
    		  new Employee("David", "HR"),
    		  new Employee("Peter", "Develper"),
    		  new Employee("Harish", "Tester")
    		  );
      
      HashMap<String, List<Employee>> mpHashMap = new HashMap<String, List<Employee>>();
      
      for(Employee employee : list) {
    	  mpHashMap.putIfAbsent(employee.dept, new ArrayList<Employee>());
    	  mpHashMap.get(employee.dept).add(employee);
    	  
      }
    		  System.out.println(mpHashMap);
    }
    }
    
    


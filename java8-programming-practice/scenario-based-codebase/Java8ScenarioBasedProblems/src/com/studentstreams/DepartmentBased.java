package com.studentstreams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DepartmentBased {
public static void main(String[] args) {
	
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riya", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Neha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	
	System.out.println("1.");
	Map<String, List<Student>> stdNameStrings = 
			students.stream()
			.collect(Collectors.groupingBy(s -> s.departmentString));
			
			System.out.println("---------------");
			
			System.out.println("2.");
			
			students.stream()
			.filter(s -> s.departmentString.equals("CSE"))
			.min(Comparator.comparingInt(s -> s.age))
			.ifPresent(s -> System.out.println("Youngest student is: "+ s));
 
			System.out.println("------------------");
			
			System.out.println("3.");
			
			students.stream()
			.filter(x -> x.departmentString.equalsIgnoreCase("Mechanical"))
			.max(Comparator.comparingInt(s -> s.rank))
			.ifPresent(System.out::println);
			
			System.out.println("-----------");
			
			
			System.out.println("4.");
			
			Long dLong = students.stream()
			.filter(s -> s.departmentString.equals("EC"))
			.count()
			;
			System.out.println(dLong);
			}
}

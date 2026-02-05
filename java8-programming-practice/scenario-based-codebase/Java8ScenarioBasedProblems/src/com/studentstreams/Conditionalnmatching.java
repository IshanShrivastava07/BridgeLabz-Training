package com.studentstreams;

import java.util.List;

public class Conditionalnmatching {
public static void main(String[] args) {
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riya", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Neha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	System.out.println("1.Check if any student belongs to Biotech Engineering.");
	
	boolean exists = students.stream()
	.anyMatch(x -> x.departmentString.equals("Biotech Engineering"));
	
	System.out.println(exists);
	
	System.out.println("---------------");
	
	
	System.out.println("2.Check if all students are above age 20.\r\n"
			+ "");
	
	boolean ageCheck = 
			students.stream()
			.allMatch(s-> s.age > 20);
	
	System.out.println(ageCheck);
	System.out.println("-----------------");
	
	System.out.println("3.Check if no student belongs to Civil Engineering.\r\n"
			+ "");
	
	boolean noCivilStd = students.stream()
			.noneMatch(s -> s.departmentString.equalsIgnoreCase("Civil"));
	
	System.out.println(noCivilStd);

	System.out.println("---------------");
}
}

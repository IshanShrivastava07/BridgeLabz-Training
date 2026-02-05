package com.studentstreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class GroupingNAggregation {
	
	public static void main(String[] args) {
		
	
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riya", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Neha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	System.out.println("1.Count the number of students in each department.");
	System.out.println();
	students.stream()
	.collect(Collectors.groupingBy(s -> s.departmentString,
			Collectors.counting()))
			.forEach((names,department) ->
			System.out.println(names +" " +department)
			);
	
	System.out.println();
	System.out.println("2.Count the number of students in each city.");
	
	students.stream()
	.collect(Collectors.groupingBy(s -> s.cityString,
			Collectors.counting()))
	  .forEach((city,name) -> 
	System.out.println(city+" "+ name)	
	);
		
	System.out.println();
	
	System.out.println("3.Find the average age of students in each department.");
	
	students.stream()
	.collect(Collectors.groupingBy(s -> s.departmentString,
			Collectors.averagingInt(s -> s.age)))
	.forEach((department, name) -> 
	System.out.println(department+ " "+ name));
	System.out.println();
	
	System.out.println("4.Find the average rank of students by gender.\r\n"
			+ "");
	
	students.stream()
	.collect(Collectors.groupingBy(g -> g.genderString,
			Collectors.averagingInt(r -> r.rank)))
	.forEach((gender, rank) -> System.out.println(gender+ " "+ rank));
	System.out.println();
	
	System.out.println("5.Find the total number of students in the organization.\r\n"
			+ "");
	
long studentsCount = students.stream().count();
System.out.println("Total students: " + studentsCount);
	
	System.out.println();
	
	System.out.println("6.Find the department with the highest average rank.\r\n"
			);
	
	
	students.stream()
	.collect(Collectors.groupingBy(s -> s.departmentString,
			Collectors.averagingInt(s -> s.rank)))
	.entrySet()
	.stream()
	.max(Map.Entry.comparingByValue())
	.ifPresent( e -> System.out.println("Department with highest average rank: "
	+ e.getKey() + " = " + e.getValue()));
	
	System.out.println();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
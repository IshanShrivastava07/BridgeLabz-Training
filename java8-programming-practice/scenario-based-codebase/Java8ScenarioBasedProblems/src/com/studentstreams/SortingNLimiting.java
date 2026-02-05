package com.studentstreams;

import java.util.Comparator;
import java.util.List;



public class SortingNLimiting {
	
	public static void main(String[] args) {
		
	
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riya", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Neha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	System.out.println("1.Sort students by rank (ascending).\r\n"
			+ "");
	System.out.println();
	
	students.stream()
	.sorted((a,b) -> (a.rank - b.rank))
	.forEach(System.out::println);
	
	System.out.println("2.Sort students by age (descending).\r\n"
			+ "");
	System.out.println();
	
	students.stream()
	.sorted((a,b) -> (b.rank - a.rank))
	.forEach(System.out::println);
	
	System.out.println("3.Print top 5 students based on rank.");
	System.out.println();
	
	students.stream()
	.sorted((a,b) -> (a.rank - b.rank))
	.limit(3)
	.forEach(System.out::println);
	
	System.out.println("4.Print last 3 students based on rank.");
	System.out.println();
	
	students.stream()
	.sorted((a,b) -> (b.rank - a.rank))
	.limit(3)
	.forEach(System.out::println);
	
	
	System.out.println("5.Print students sorted by name and then rank.");
	System.out.println();
	
	students.stream()
	.sorted(Comparator
			.comparing(Student :: getFirstnameString)
	.thenComparingInt(Student :: getRank))
	.map(Student :: getFirstnameString)
	.forEach(System.out::println);
	
	
}

}
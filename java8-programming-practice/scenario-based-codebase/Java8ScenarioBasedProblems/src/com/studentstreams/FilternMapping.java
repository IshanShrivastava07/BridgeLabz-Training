package com.studentstreams;

import java.util.List;

public class FilternMapping {
	public static void main(String[] args) {
		
	
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riya", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Neha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	System.out.println("1.Print all students whose rank is less than 50.");
	
	students.stream()
	.filter(x -> x.rank < 50)
	.forEach(System.out::println);
	
	System.out.println("--------------------------------------------------");
	
	
	System.out.println();
	
	
System.out.println("2.Print all students whose age is greater than 25.\r\n");
	
	students.stream()
	.filter(x -> x.age > 25)
	.map(x -> x.age)
	.forEach(System.out::println);
	
	System.out.println("--------------------------------------------------");
	System.out.println();
	
	
	System.out.println("3.Print the names of all students only.");
	
	List<String> stdnameStrings =  students.stream()
	.map(x -> x.firstnameString)
	.toList();
	System.out.println(stdnameStrings);
	
	System.out.println();
	
	System.out.println("4.Print all students belonging to Mechanical Engineering.");
	
	 students.stream()
			.filter(x -> x.departmentString.equalsIgnoreCase("mechanical"))
			.map(x -> x.firstnameString)
			.forEach( System.out::println);
	 
	 System.out.println("------------------------------------------------------------");
	 System.out.println();
	 
	 System.out.println("5.Print all students not from Mumbai.");
	 
	 
	 students.stream()
	 .filter(x -> x.cityString.equals("Mumbai"))
	 .forEach(System.out::println);
	 
	 System.out.println("---------------------------------------------------------------");
}
	
}

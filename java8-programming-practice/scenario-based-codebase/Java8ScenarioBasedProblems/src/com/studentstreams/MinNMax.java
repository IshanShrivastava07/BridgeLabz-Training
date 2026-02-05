package com.studentstreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class MinNMax {
public static void main(String[] args) {
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riya", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Neha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	System.out.println("1.Find the student with the best (lowest) rank");
	students.stream()
	.min(Comparator.comparingInt(s -> s.rank))
	.map(s -> s.firstnameString)
	.ifPresent(System.out::println);
	System.out.println("---------");
	
	System.out.println("2.Find the student with the worst (highest) rank.\r\n"
			+ "");
	
	students.stream()
	.max(Comparator.comparingInt(s -> s.rank))
	.map(s -> s.firstnameString)
	.ifPresent(System.out::println);
	System.out.println("---------");
	
	System.out.println("3.Find the second best rank holder.");
	
	students.stream()
	.sorted(Comparator.comparingInt(s -> s.rank))
    .skip(1)
    .findFirst()
    .map(s -> s.firstnameString)
    .ifPresent(System.out::println);
 
	System.out.println("----------");
	
	System.out.println("4.Find the third best rank holder.\r\n"
			+ "");
	
	students.stream()
	.sorted(Comparator.comparingInt(s -> s.rank))
	.skip(2)
	.findFirst()
	.map(s -> s.firstnameString)
	.ifPresent(System.out::println);
	
	System.out.println("---------");
	
	System.out.println("5.Find the youngest student.");
	
	students.stream()
	.min(Comparator.comparingInt(s -> s.age))
	.map(s -> s.firstnameString)
	.ifPresent(System.out::println);
	
	System.out.println("----------");
	
	System.out.println("6.Find the oldest student.");
	
	students.stream()
	.max(Comparator.comparingInt(s -> s.age))
	.map(s -> s.firstnameString)
	.ifPresent(System.out::println);
}
}

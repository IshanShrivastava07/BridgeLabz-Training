package com.studentstreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FlatmapNCollections {
public static void main(String[] args) {
	
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riya", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Neha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	System.out.println("1.Print all contact numbers of all students.\r\n");
	
	students.stream()
	.flatMap(s -> s.contacts.stream())
	.forEach(System.out::println);
	
	System.out.println("---------------");
	
	System.out.println("2.Count the total number of contact numbers.\r\n"
			+ "");
	
	long totalContacts = students.stream()
	.flatMap(s -> s.contacts.stream())
	.count();
	
	System.out.println("Total contantacts: " + totalContacts);
	System.out.println("----------------");
	
	System.out.println("3.Find students who have more than one contact number.");
	
	students.stream()
	.flatMap(s -> s.getContacts().size() > 1 ? Stream.of(s) : Stream.empty())
	.forEach(System.out::println);
	
	System.out.println("----------------");
	
	System.out.println("4.Print unique contact numbers.");
	
	students.stream()
	.flatMap(s -> s.contacts.stream())
	.distinct()
	.forEach(System.out::println);
	
	System.out.println("-------");
}
}

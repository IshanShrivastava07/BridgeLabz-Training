package com.studentstreams;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BonusQuestions {
public static void main(String[] args) {
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riyansh", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Sneha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	
	System.out.println("1.Find the top 3 youngest students.");
	
	students.stream()
	.sorted(Comparator.comparingInt(s -> s.age)).limit(3)
	.map(a -> a.firstnameString)
	.forEach(System.out::println);
	System.out.println("------------");
	
	System.out.println("2.Find the top 3 oldest students.");
	
	students.stream()
	.sorted(Comparator.comparingInt((Student s) -> s.age).reversed())
	.limit(3)
	.map(a -> a.firstnameString)
	.forEach(System.out::println);
	System.out.println("------------");
	
	System.out.println("3.Partition students based on age > 25.");
	
	
	Map<Boolean, List<Student>> partitionedMap =
	students.stream()
	.collect(Collectors.partitioningBy(s -> s.age > 25));
	partitionedMap.forEach((key, list) ->
	System.out.println(key + " : "+ list));
	
	System.out.println("---------------");
	
	System.out.println("5.Find the city having maximum students.\r\n"
			);
	
	students.stream()
    .collect(Collectors.groupingBy(
            s -> s.cityString,
            Collectors.counting()
    ))
    .entrySet()
    .stream()
    .max(Map.Entry.comparingByValue())
    .ifPresent(e ->
            System.out.println(
                    "City with max students: " + e.getKey() + " = " + e.getValue()
            )
    );
System.out.println("----------------");
	System.out.println("6.Find the department having minimum students.");
	
	students.stream()
	.collect(Collectors.groupingBy(d -> d.departmentString,
			Collectors.counting()))
	.entrySet()
	.stream()
	.min(Map.Entry.comparingByValue())
	.ifPresent(f -> 
	System.out.println("Department with most students" 
	+ f.getKey() + " : "+ f.getValue()));
	
	System.out.println("--------------");
	
}
}

package com.studentstreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class GenderBasedAnalysis {
public static void main(String[] args) {
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riya", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Neha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	System.out.println("1.Count male and female students.");
	
	students.stream()
    .collect(Collectors.groupingBy(g -> g.genderString,
    		Collectors.counting()))
	.forEach((gender, count) -> System.out.println(gender +" = "+ count));
	
System.out.println("----------------");
	System.out.println("2.Find the average age of male students.\r\n"
			+ "");
	
	double avgAgeMale = students.stream()
	.filter(s -> s.genderString.equals("Male"))
	.collect(
			Collectors.averagingInt(a -> a.age));
	System.out.println("Avg Age of Males: "+ avgAgeMale);
	
	
	System.out.println("-----------------");
	
	System.out.println("4.Find the highest ranked male student.");
	
	students.stream()
	.filter(s -> s.genderString.equalsIgnoreCase("Male"))
	.max(Comparator.comparingInt(s -> s.rank))
	.map(s -> s.firstnameString)
	.ifPresent(System.out::println);
	System.out.println("---------------");
	
	
	System.out.println("5.Find the highest ranked female student.");
	
	students.stream()
	.filter(d -> d.genderString.equals("Female"))
	.max(Comparator.comparing(d -> d.rank))
	.map(s -> s.firstnameString)
	.ifPresent(System.out::println);
	
		
}

}

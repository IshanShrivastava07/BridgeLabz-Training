
package com.studentstreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvanceLevel {
public static void main(String[] args) {
	
	List<Student> students = List.of(
            new Student(1, "Aman", 20, "Male", "Delhi","Mechanical", 45, List.of("9999999999")),
            new Student(2, "Riyansh", 26, "Female", "Mumbai","CSE", 72, List.of("8888888888")),
            new Student(3, "Sneha", 19, "Female", "Pune", "EC",30, List.of("7777777777"))
        );
	
	System.out.println("1.Convert the student list into a Map<Id, Name>.");
	Map<Integer, String> mpMap = 
			students.stream()
			.collect(Collectors.toMap(s -> s.id, s -> s.firstnameString
					));
			System.out.println(mpMap);
			
			System.out.println("-------------");
			
			
			System.out.println("2.Convert the student list into a Map<Department, List<Student>>.\r\n"
					);
			
			Map<String, List<Student>> mpMap2 = 
					students.stream()
					.collect(Collectors.groupingBy(
							s -> s.departmentString
							));
			System.out.println(mpMap2);
			
			System.out.println();
			System.out.println("-------------");
			
			
			System.out.println("3.Find students whose name starts with 'S");
			
			students.stream()
			.filter(s -> s.firstnameString.startsWith("S"))
			.map(s -> s.firstnameString)
			.forEach(System.out::println);
			
			System.out.println(" ");
			System.out.println("-------------");
			
			System.out.println("4.Find students whose name length is greater than 5.\r\n"
					);
              
			students.stream()
			.filter(s -> s.firstnameString.length() > 5)
			.map(s -> s.firstnameString)
			.forEach(System.out::println);
			System.out.println("-----------");
			
			System.out.println("5.Find students whose rank is even.");
			
			students.stream()
			.filter(s -> s.rank % 2 == 0)
			.map(s -> s.firstnameString)
			.forEach(System.out::println);
			
			System.out.println("-------------");
}
}

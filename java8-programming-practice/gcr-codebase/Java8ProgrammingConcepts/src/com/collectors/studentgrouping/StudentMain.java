package com.collectors.studentgrouping;

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    String getName() { return name; }
    String getGrade() { return grade; }
}

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Ishan", "A"),
            new Student("Ravi", "B"),
            new Student("Neha", "A"),
            new Student("Anita", "C")
        );

        Map<String, List<String>> result =
            students.stream()
                    .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())
                    ));

        result.forEach((grade, names) ->
            System.out.println(grade + " -> " + names)
        );
    }
}

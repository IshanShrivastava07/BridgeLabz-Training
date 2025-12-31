package com.bridgelabz.objectmodelling.levelone;

//Student associates with UnivCourse
public class UnivStudent {
 String name;

 public UnivStudent(String name) {
     this.name = name;
 }

 public void enrollCourse(UnivCourse c) {
     System.out.println(name + " enrolled in " + c.courseName);
 }
}


package com.bridgelabz.objectmodelling.levelone;

//Course aggregates Professor
public class UnivCourse {
 String courseName;
 Professor professor;

 public UnivCourse(String courseName) {
     this.courseName = courseName;
 }

 public void assignProfessor(Professor p) {
     this.professor = p;
 }
}

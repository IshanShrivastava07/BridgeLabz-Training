package com.bridgelabz.skillforge;

public class SkillForgeMain {
    public static void main(String[] args) {
        
    	//Instructor class object
        Instructor instructor = new Instructor("Rahul", "rahul@skillforge.com");
        Course javaCourse = new Course("Java Mastery", "Rahul");

        instructor.uploadCourse(javaCourse);

        Student student = new Student("Amit", "amit@gmail.com");
        student.updateProgress(100);
        student.generateCertificate(javaCourse);
     }
}


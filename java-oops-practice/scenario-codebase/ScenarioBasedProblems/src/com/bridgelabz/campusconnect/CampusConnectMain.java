package com.bridgelabz.campusconnect;

public class CampusConnectMain {
    public static void main(String[] args) {

        Faculty faculty = new Faculty(1, "Dr. Sharma", "sharma@college.edu");
        Student student1 = new Student(101, "Aman", "aman@student.edu");
        Student student2 = new Student(102, "Riya", "riya@student.edu");

        Course course = new Course("Data Structures", faculty);

        student1.enrollCourse(course);
        student2.enrollCourse(course);

        student1.addGrade(8);
        student1.addGrade(9);

        student2.addGrade(7);
        student2.addGrade(8);

        faculty.printDetails();
        System.out.println();

        student1.printDetails();
        System.out.println();

        student2.printDetails();
        System.out.println();

        course.showCourseDetails();
    }
}


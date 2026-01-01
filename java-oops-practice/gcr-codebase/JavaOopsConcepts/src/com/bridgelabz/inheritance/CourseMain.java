package com.bridgelabz.inheritance;

public class CourseMain {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse();
        c.courseName = "Java OOP";
        c.fee = 5000;
        c.discount = 500;

        System.out.println("Course: " + c.courseName);
        System.out.println("Fee: " + (c.fee - c.discount));
    }
}

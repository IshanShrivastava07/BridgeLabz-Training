package com.bridgelabz.constructor.levelone;

public class UniversityMain {
    public static void main(String[] args) {
        PostgraduateStudent ps = new PostgraduateStudent(101, "Sid", 8.5);
        ps.setCGPA(8.9);
        System.out.println(ps.rollNumber + " " + ps.name + " " + ps.getCGPA());
    }
}

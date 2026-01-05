package com.bridgelabz.universitycoursemanagement;

public class UniversityMain {
    public static void main(String[] args) {

        Student s1 = new UnderGraduate("Rahul");
        Student s2 = new PostGraduate("Neha");

        s1.assignGrade();
        s2.assignGrade();

        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
    }
}

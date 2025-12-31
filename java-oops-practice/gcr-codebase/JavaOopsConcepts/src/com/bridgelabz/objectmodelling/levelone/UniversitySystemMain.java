package com.bridgelabz.objectmodelling.levelone;

public class UniversitySystemMain {
    public static void main(String[] args) {

        UnivStudent s1 = new UnivStudent("Ishan");
        UnivCourse c1 = new UnivCourse("Java");
        Professor p1 = new Professor("Dr. Rao");

        c1.assignProfessor(p1);
        s1.enrollCourse(c1);
    }
}

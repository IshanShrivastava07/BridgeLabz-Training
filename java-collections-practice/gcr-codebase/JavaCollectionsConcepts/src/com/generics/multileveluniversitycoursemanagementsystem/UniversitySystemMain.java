package com.generics.multileveluniversitycoursemanagementsystem;

public class UniversitySystemMain {

    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> programming =
                new Course<>("Programming", new AssignmentCourse());

        Course<ResearchCourse> ai =
                new Course<>("AI Research", new ResearchCourse());

        CourseCatalog catalog = new CourseCatalog();

        catalog.addCourse(math);
        catalog.addCourse(programming);
        catalog.addCourse(ai);

        System.out.println("All Courses:");
        catalog.displayAll();
    }
}

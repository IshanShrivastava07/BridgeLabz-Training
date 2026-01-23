package com.generics.multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Manages multiple courses of different types
public class CourseCatalog {

    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayAll() {
        for (Course<? extends CourseType> c : courses) {
            System.out.println(
                    c.getCourseName() + " | " +
                    c.getCourseType().getType() + " | " +
                    c.getCourseType().getEvaluationMethod()
            );
        }
    }
}

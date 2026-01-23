package com.generics.multileveluniversitycoursemanagementsystem;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignments & Quizzes");
    }

    @Override
    public String getType() {
        return "Assignment-Based Course";
    }
}


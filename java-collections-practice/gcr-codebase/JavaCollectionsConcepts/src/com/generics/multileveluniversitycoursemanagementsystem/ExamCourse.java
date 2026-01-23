package com.generics.multileveluniversitycoursemanagementsystem;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Written Exams");
    }

    @Override
    public String getType() {
        return "Exam-Based Course";
    }
}

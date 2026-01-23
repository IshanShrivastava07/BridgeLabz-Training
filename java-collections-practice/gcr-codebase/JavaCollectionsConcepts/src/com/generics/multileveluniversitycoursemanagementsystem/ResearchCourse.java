package com.generics.multileveluniversitycoursemanagementsystem;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research & Thesis");
    }

    @Override
    public String getType() {
        return "Research-Based Course";
    }
}


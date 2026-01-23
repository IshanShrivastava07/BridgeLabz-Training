package com.generics.multileveluniversitycoursemanagementsystem;

//Abstract base class for all course evaluation types
public abstract class CourseType {

 private String evaluationMethod;

 public CourseType(String evaluationMethod) {
     this.evaluationMethod = evaluationMethod;
 }

 public String getEvaluationMethod() {
     return evaluationMethod;
 }

 public abstract String getType();
}

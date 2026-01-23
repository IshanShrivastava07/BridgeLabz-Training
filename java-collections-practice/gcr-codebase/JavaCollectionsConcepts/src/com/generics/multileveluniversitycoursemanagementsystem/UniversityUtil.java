package com.generics.multileveluniversitycoursemanagementsystem;
import java.util.List;

//Utility class using wildcard
public class UniversityUtil {

 // Can accept list of any subclass of CourseType
 public static void displayCourses(List<? extends CourseType> list) {

     for (CourseType type : list) {
         System.out.println(type.getType() +
                 " | Evaluation: " +
                 type.getEvaluationMethod());
     }
 }
}

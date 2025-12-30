 package com.bridgelabz.oops.inbuiltfunction;
public class UniversityStudent {
   // Static variable shared across all instances
   private static String universityName;
   private static int totalStudents = 0;
   // Instance variables
   private final int rollNumber; // Final variable to ensure the roll number cannot be changed
   private String name;
   private char grade;
   // Constructor to initialize name, rollNumber, and grade
   public UniversityStudent(String name, int rollNumber, char grade) {
       this.name = name;
       this.rollNumber = rollNumber;
       this.grade = grade;
       totalStudents++;
   }
   // Static method to set the university name
   public static void setUniversityName(String name) {
       universityName = name;
   }
   // Static method to display the total number of students enrolled
   public static void displayTotalStudents() {
       System.out.println("Total Students Enrolled: " + totalStudents);
   }
   // Method to display student details
   public void displayStudentDetails() {
       // Using 'instanceof' to verify the object's type before displaying details
       if (this instanceof UniversityStudent) {
           System.out.println("University Name: " + universityName);
           System.out.println("Roll Number: " + rollNumber);
           System.out.println("Name: " + name);
           System.out.println("Grade: " + grade);
       } else {
           System.out.println("The object is not an instance of the Student class.");
       }
   }
   // Method to update the student's grade
   public void updateGrade(char newGrade) {
       // Using 'instanceof' to verify the object's type before updating grade
       if (this instanceof UniversityStudent) {
           this.grade = newGrade;
           System.out.println("Grade updated to: " + newGrade);
       } else {
           System.out.println("The object is not an instance of the Student class.");
       }
   }
   // Getters for instance variables (optional, but recommended for encapsulation)
   public String getName() {
       return name;
   }
   public int getRollNumber() {
       return rollNumber;
   }
   public char getGrade() {
       return grade;
   }
   public static void main(String[] args) {
       // Set the university name (static variable)
	   UniversityStudent.setUniversityName("Global University");
       // Create new student instances
       UniversityStudent student1 = new UniversityStudent("Hemashree", 101, 'A');
       UniversityStudent student2 = new UniversityStudent("Sharmila", 102, 'B');
       // Display total number of students enrolled
       UniversityStudent.displayTotalStudents();
       // Display student details
       student1.displayStudentDetails();
       System.out.println();
       student2.displayStudentDetails();
       // Update student grade
       student2.updateGrade('A');
       System.out.println();
       // Display updated student details
       student2.displayStudentDetails();
   }
}

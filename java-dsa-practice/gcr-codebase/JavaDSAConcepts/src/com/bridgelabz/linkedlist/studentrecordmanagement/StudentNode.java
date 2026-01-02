package com.bridgelabz.linkedlist.studentrecordmanagement;

public class StudentNode {

	int rollno, age;
	String name, grade;
	StudentNode next;
	
	public StudentNode(int rollno, int age, String name, String grade) {
		this.rollno = rollno;
		this.age = age;
		this.name = name;
		this.grade = grade;
		this.next = null;
	}
}

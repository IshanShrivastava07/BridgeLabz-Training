package com.bridgelabz.linkedlist.studentrecordmanagement;

public class StudentLinkedList {

	private StudentNode head;
	
	public void addAtBeginning(int rollno, int age, String name, String grade) {
		StudentNode node = new StudentNode(rollno, age, name, grade);
		node.next = head;
		head = node;
	}
public void addAtEnd(int rollno, int age, String name, String grade) {
	StudentNode node = new StudentNode(rollno, age, name, grade);
	if(head == null) {
		head = node;
		return;
	}
StudentNode temp= head;
while(temp.next != null) {
	temp = temp.next;
}
temp.next = node;
}

public void addAtPosition(int pos, int rollno, int age, String name, String grade) {
	
	if(pos == 1) {
		addAtBeginning(rollno, age, name, grade);
		return;
	}
	
	StudentNode temp = head;
	for(int i = 1; i < pos-1 && temp != null; i++) {
		temp = temp.next;
	}
		if(temp == null) return;
		
		StudentNode node = new StudentNode(rollno, age, name, grade);
		node.next = temp.next;
		temp.next = node;
	}


public void deleteByRollNo(int rollNo) {
	if (head == null) return;
	
	if(head.rollno == rollNo) {
		head = head.next;
		return;
	}
	StudentNode temp = head;
	while(temp.next != null && temp.next.rollno != rollNo) {
		temp = temp.next;
	}
		
		if(temp.next != null)
			temp.next = temp.next.next;
	}

	
	public void search(int rollno) {
		StudentNode temp = head;
		
		while(temp != null)
		{
			if(temp.rollno == rollno) {
				System.out.println("Found: " + temp.name + ",  Grade: " + temp.grade);
				return;
			}
			temp = temp.next;
		}
}

	
	public void updateGrade(int rollNo, String newGrade) {
		StudentNode temp = head;
		while(temp != null) {
			if(temp.rollno == rollNo) {
				temp.grade = newGrade;
				return;
			}
			temp = temp.next;
		}
	}
	public void display() {
		StudentNode temp = head;
		while(temp != null) {
			System.out.println(temp.rollno +"|"+ temp.name + "|"+ temp.age+ "|"+ temp.grade );
			temp = temp.next;
			}
		
	}
	
}

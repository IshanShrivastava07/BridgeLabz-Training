package com.bridgelabz.linkedlist.studentrecordmanagement;

public class StudentRecordMain {

	public static void main(String[] args) {
		StudentLinkedList list = new StudentLinkedList();
		
		list.addAtBeginning(1, 20, "Anay", "A");
        list.addAtEnd(2, 21,"Ron", "B");
        list.addAtPosition(2, 3,  22, "Rahul", "C");

        list.display();

        list.search(2);
        list.updateGrade(3, "A+");
        list.deleteByRollNo(1);

        System.out.println("After updates:");
        list.display();
    }
}


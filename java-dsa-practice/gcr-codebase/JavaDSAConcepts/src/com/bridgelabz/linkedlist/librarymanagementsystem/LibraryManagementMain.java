package com.bridgelabz.linkedlist.librarymanagementsystem;

public class LibraryManagementMain {

	public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtBeginning(1, "Clean Code", "Robert Martin", "Programming", true);
        library.addAtEnd(2, "Effective Java", "Joshua Bloch", "Programming", true);
        library.addAtPosition(2, 3, "The Alchemist", "Paulo Coelho", "Fiction", true);

        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("\nLibrary (Reverse):");
        library.displayReverse();

        library.updateAvailability(2, false);
        library.removeByBookId(1);

        System.out.println("\nAfter Updates:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}
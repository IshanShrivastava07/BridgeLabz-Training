package com.bridgelabz.linkedlist.moviemanagementsystem;

public class MovieManagementMain {
    public static void main(String[] args) {

    	MovieDoublyLinkedList list = new MovieDoublyLinkedList();

         list.addAtBeginning("Inception", "Nolan", 2010, 9.0);
         list.addAtEnd("Interstellar", "Nolan", 2014, 8.8);
         list.addAtPosition(2, "Avatar", "Cameron", 2009, 8.5);

         System.out.println("Forward Display:");
         list.displayForward();

         System.out.println("\nReverse Display:");
         list.displayReverse();

         list.updateRating("Avatar", 9.1);
         list.removeByTitle("Inception");

         System.out.println("\nAfter Updates:");
         list.displayForward();
    }
}

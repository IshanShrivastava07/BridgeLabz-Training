
package com.bridgelabz.linkedlist.moviemanagementsystem;

public class MovieDoublyLinkedList {

	private MovieNode head;
	private MovieNode tail;
	
	 public void addAtBeginning(String title, String director, int year, double rating) {
	        MovieNode node = new MovieNode(title, director, year, rating);

	        if (head == null) {
	            head = tail = node;
	            return;
	        }
	        node.next = head;
	        head.prev = node;
	        head = node;
	    }

	    // Add at end
	    public void addAtEnd(String title, String director, int year, double rating) {
	        MovieNode node = new MovieNode(title, director, year, rating);

	        if (head == null) {
	            head = tail = node;
	            return;
	        }
	        tail.next = node;
	        node.prev = tail;
	        tail = node;
	    }

	    // Add at position (1-based)
	    public void addAtPosition(int pos, String title, String director, int year, double rating) {
	        if (pos == 1) {
	            addAtBeginning(title, director, year, rating);
	            return;
	        }

	        MovieNode temp = head;
	        for (int i = 1; i < pos - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null || temp.next == null) {
	            addAtEnd(title, director, year, rating);
	            return;
	        }

	        MovieNode node = new MovieNode(title, director, year, rating);
	        node.next = temp.next;
	        node.prev = temp;
	        temp.next.prev = node;
	        temp.next = node;
	    }

	    // Remove by movie title
	    public void removeByTitle(String title) {
	        MovieNode temp = head;

	        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
	            temp = temp.next;
	        }

	        if (temp == null) return;

	        if (temp == head) {
	            head = head.next;
	            if (head != null) head.prev = null;
	            else tail = null;
	            return;
	        }

	        if (temp == tail) {
	            tail = tail.prev;
	            tail.next = null;
	            return;
	        }

	        temp.prev.next = temp.next;
	        temp.next.prev = temp.prev;
	    }

	    // Search by director
	    public void searchByDirector(String director) {
	        MovieNode temp = head;
	        while (temp != null) {
	            if (temp.director.equalsIgnoreCase(director)) {
	                printMovie(temp);
	            }
	            temp = temp.next;
	        }
	    }

	    // Search by rating
	    public void searchByRating(double rating) {
	        MovieNode temp = head;
	        while (temp != null) {
	            if (temp.rating == rating) {
	                printMovie(temp);
	            }
	            temp = temp.next;
	        }
	    }

	    // Update rating by title
	    public void updateRating(String title, double newRating) {
	        MovieNode temp = head;
	        while (temp != null) {
	            if (temp.title.equalsIgnoreCase(title)) {
	                temp.rating = newRating;
	                return;
	            }
	            temp = temp.next;
	        }
	    }

	    // Display forward
	    public void displayForward() {
	        MovieNode temp = head;
	        while (temp != null) {
	            printMovie(temp);
	            temp = temp.next;
	        }
	    }

	    // Display reverse
	    public void displayReverse() {
	        MovieNode temp = tail;
	        while (temp != null) {
	            printMovie(temp);
	            temp = temp.prev;
	        }
	    }

	    private void printMovie(MovieNode m) {
	        System.out.println(m.title + " | " + m.director + " | " +
	                m.year + " | Rating: " + m.rating);
	    }
}

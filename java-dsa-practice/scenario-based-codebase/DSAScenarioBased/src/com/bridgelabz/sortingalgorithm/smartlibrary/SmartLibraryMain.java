package com.bridgelabz.sortingalgorithm.smartlibrary;

public class SmartLibraryMain {
	
	    public static void main(String[] args) {

	        Book[] borrowed = new Book[10];
	        int count = 0;

	        // Dynamic insertions
	        borrowed[count++] = new Book("Java Basics", "James");
	        LibrarySort.insertionSort(borrowed, count);

	        borrowed[count++] = new Book("Algorithms", "CLRS");
	        LibrarySort.insertionSort(borrowed, count);

	        borrowed[count++] = new Book("Data Structures", "Seymour");
	        LibrarySort.insertionSort(borrowed, count);

	        borrowed[count++] = new Book("Operating Systems", "Tanenbaum");
	        LibrarySort.insertionSort(borrowed, count);

	        System.out.println("Sorted Borrowed Books:");
	        LibrarySort.display(borrowed, count);
	    }
	}



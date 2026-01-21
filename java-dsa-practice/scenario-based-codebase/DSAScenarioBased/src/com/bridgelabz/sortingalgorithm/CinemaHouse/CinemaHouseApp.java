package com.bridgelabz.sortingalgorithm.CinemaHouse;

public class CinemaHouseApp {
	
	    public static void main(String[] args) {

	        MovieShow[] shows = {
	            new MovieShow("Avengers", "18:30"),
	            new MovieShow("Inception", "21:15"),
	            new MovieShow("Interstellar", "16:00"),
	            new MovieShow("Jumanji", "14:45"),
	            new MovieShow("Titanic", "19:00")
	        };

	        System.out.println("Before Sorting:");
	        BubbleSort.display(shows);

	        BubbleSort.bubbleSort(shows);

	        System.out.println("\nAfter Sorting (by Show Time):");
	        BubbleSort.display(shows);
	    }
	}



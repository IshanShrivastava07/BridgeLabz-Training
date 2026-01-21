package com.bridgelabz.sortingalgorithm.fitnesstracker;

public class FitnessTrackerApp {
	
	    public static void main(String[] args) {

	        User[] group = {
	            new User("Amit", 8500),
	            new User("Neha", 12000),
	            new User("Ravi", 7600),
	            new User("Pooja", 15000),
	            new User("Karan", 9800)
	        };

	        System.out.println("Before Ranking:");
	        BubbleSort.display(group);

	        // Real-time re-sorting (after last sync)
	        BubbleSort.bubbleSort(group);

	        System.out.println("\nDaily Leaderboard:");
	        BubbleSort.display(group);
	    }
	}		



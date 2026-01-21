package com.bridgelabz.sortingalgorithm.icecreamrush;

public class IceCreamRushMainApp {
	    public static void main(String[] args) {

	        Flavour[] flavors = {
	            new Flavour("Vanilla", 120),
	            new Flavour("Chocolate", 200),
	            new Flavour("Strawberry", 90),
	            new Flavour("Mango", 150),
	            new Flavour("Butterscotch", 110),
	            new Flavour("Pistachio", 80),
	            new Flavour("Blueberry", 60),
	            new Flavour("Coffee", 140)
	        };

	        System.out.println("Before Sorting:");
	        BubbleSort.display(flavors);

	        BubbleSort.bubbleSort(flavors);

	        System.out.println("\nAfter Sorting (by Popularity):");
	        BubbleSort.display(flavors);
	    }
	}


	
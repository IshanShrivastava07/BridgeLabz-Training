package com.bridgelabz.sortingalgorithm.flashdeals;

public class FlashDealsApp {
	
	    public static void main(String[] args) {

	        Product[] products = {
	            new Product("P101", "Smartphone", 30.0),
	            new Product("P102", "Laptop", 45.0),
	            new Product("P103", "Headphones", 20.0),
	            new Product("P104", "Smartwatch", 50.0),
	            new Product("P105", "Camera", 35.0)
	        };

	        System.out.println("Before Sorting:");
	        QuickSort.display(products);

	        // Fast sorting for flash sale
	        QuickSort.quicksort(products, 0, products.length - 1);

	        System.out.println("\nAfter Sorting (by Highest Discount):");
	        QuickSort.display(products);

	        System.out.println("\nTop 3 Discounted Products:");
	        for (int i = 0; i < 3; i++) {
	            System.out.println(products[i].name + " - " + products[i].discount + "%");
	        }
	    }
	}



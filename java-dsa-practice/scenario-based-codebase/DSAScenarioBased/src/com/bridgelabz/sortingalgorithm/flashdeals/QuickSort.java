package com.bridgelabz.sortingalgorithm.flashdeals;

public class QuickSort {
public static void quicksort(Product[] arr, int low, int high) {
	
	if(low < high) {
		int pi = partition(arr,low,high);
		
		quicksort(arr, low, pi-1);
		quicksort(arr, pi + 1, high);
	}
}

private static int partition(Product[] arr, int low, int high) {
	double pivot = arr[high].discount;
	int i = low - 1;
	
	for(int j = low; j <= high; j++) {
		if(arr[j].discount >= pivot) {
			i++;
			Product temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	Product temp = arr[i+1];
	arr[i+1] = arr[high];
	arr[high] = temp;
	
	return i + 1;
}
public static void display(Product[] arr) {
	for(Product p : arr) {
		System.out.println(p.productId + " | " + p.name + " | Discount: " + p.discount + "%");
	}
}
}

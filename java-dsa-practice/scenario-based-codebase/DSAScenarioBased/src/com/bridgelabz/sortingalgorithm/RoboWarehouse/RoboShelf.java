package com.bridgelabz.sortingalgorithm.RoboWarehouse;

public class RoboShelf {

    // Insertion Sort by weight (ascending)
    public static void insertionSort(PackageItem[] items, int size) {
        for (int i = 1; i < size; i++) {
            PackageItem key = items[i];
            int j = i - 1;

            while (j >= 0 && items[j].weight > key.weight) {
                items[j + 1] = items[j];
                j--;
            }

            items[j + 1] = key;
        }
    }

    public static void display(PackageItem[] items, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i].id + " - " + items[i].weight + " kg");
        }
    }
}

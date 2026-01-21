package com.bridgelabz.sortingalgorithm.RoboWarehouse;

public class RoboWarehouseApp {
    public static void main(String[] args) {

        PackageItem[] shelf = new PackageItem[10];
        int count = 0;

        // Streaming insertions (one by one)
        shelf[count++] = new PackageItem("PKG001", 12.5);
        RoboShelf.insertionSort(shelf, count);

        shelf[count++] = new PackageItem("PKG002", 5.2);
        RoboShelf.insertionSort(shelf, count);

        shelf[count++] = new PackageItem("PKG003", 18.0);
        RoboShelf.insertionSort(shelf, count);

        shelf[count++] = new PackageItem("PKG004", 9.7);
        RoboShelf.insertionSort(shelf, count);

        System.out.println("Final Shelf Order (by Weight):");
        RoboShelf.display(shelf, count);
    }
}


package com.bridgelabz.sortingalgorithm.smartshelf;

public class MainApp {
    public static void main(String[] args) {

        Book[] shelf = new Book[10];
        int count = 0;

        // Real-time additions
        shelf[count++] = new Book("Java Programming", "James");
        SmartShelf.insertionSort(shelf, count);

        shelf[count++] = new Book("Algorithms", "CLRS");
        SmartShelf.insertionSort(shelf, count);

        shelf[count++] = new Book("Data Structures", "Seymour");
        SmartShelf.insertionSort(shelf, count);

        shelf[count++] = new Book("Artificial Intelligence", "Russell");
        SmartShelf.insertionSort(shelf, count);

        System.out.println("Sorted Reading List:");
        SmartShelf.display(shelf, count);
    }
}

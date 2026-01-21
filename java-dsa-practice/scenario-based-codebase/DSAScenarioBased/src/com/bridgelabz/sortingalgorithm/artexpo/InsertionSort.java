package com.bridgelabz.sortingalgorithm.artexpo;

public class InsertionSort {

    // Insertion Sort by registration time (ascending)
    public static void insertionSort(Artist[] artists, int size) {
        for (int i = 1; i < size; i++) {
            Artist key = artists[i];
            int j = i - 1;

            while (j >= 0 && artists[j].registrationTime.compareTo(key.registrationTime) > 0) {
                artists[j + 1] = artists[j];
                j--;
            }

            artists[j + 1] = key;
        }
    }

    public static void display(Artist[] artists, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(artists[i].name + " - Registered at " + artists[i].registrationTime);
        }
    }
}

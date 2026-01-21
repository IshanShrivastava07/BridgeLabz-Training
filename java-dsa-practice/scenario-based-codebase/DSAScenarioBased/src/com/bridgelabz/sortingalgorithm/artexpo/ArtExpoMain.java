package com.bridgelabz.sortingalgorithm.artexpo;

public class ArtExpoMain {
    public static void main(String[] args) {

        Artist[] registrations = new Artist[10];
        int count = 0;

        // Real-time registrations
        registrations[count++] = new Artist("Riya", "10:30");
        InsertionSort.insertionSort(registrations, count);

        registrations[count++] = new Artist("Aman", "09:45");
        InsertionSort.insertionSort(registrations, count);

        registrations[count++] = new Artist("Neha", "11:15");
        InsertionSort.insertionSort(registrations, count);

        registrations[count++] = new Artist("Kunal", "10:00");
        InsertionSort.insertionSort(registrations, count);

        System.out.println("Final Booth Assignment Order:");
        InsertionSort.display(registrations, count);
    }
}

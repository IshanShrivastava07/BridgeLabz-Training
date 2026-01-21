package com.bridgelabz.sortingalgorithm.HospitalQueueBubbleSort;

public class MainApp {
    public static void main(String[] args) {

        Patient[] queue = {
            new Patient("Ravi", 3),
            new Patient("Anita", 9),
            new Patient("Suresh", 5),
            new Patient("Meena", 10),
            new Patient("Karan", 7)
        };

        System.out.println("Before Sorting:");
        HospitalQueue.display(queue);

        HospitalQueue.bubbleSort(queue);

        System.out.println("\nAfter Sorting (by Criticality):");
        HospitalQueue.display(queue);
    }
}


package com.bridgelabz.sortingalgorithm.HospitalQueueBubbleSort;

public class HospitalQueue {

    // Bubble Sort
    public static void bubbleSort(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (patients[j].criticality < patients[j + 1].criticality) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
    public static void display(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p.name + " - Criticality: " + p.criticality);
        }
    }
}


package com.bridgelabz.sortingalgorithm.fitnesstracker;

public class BubbleSort {

    // Bubble Sort by steps (descending: highest steps first)
    public static void bubbleSort(User[] users) {
        int n = users.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (users[j].steps < users[j + 1].steps) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // already sorted
        }
    }

    public static void display(User[] users) {
        for (User u : users) {
            System.out.println(u.name + " - Steps: " + u.steps);
        }
    }
}

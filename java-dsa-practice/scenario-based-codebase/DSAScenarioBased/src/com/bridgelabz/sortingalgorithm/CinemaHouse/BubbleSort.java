package com.bridgelabz.sortingalgorithm.CinemaHouse;

public class BubbleSort {

    // Bubble Sort by show time (ascending)
    public static void bubbleSort(MovieShow[] shows) {
        int n = shows.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (shows[j].showTime.compareTo(shows[j + 1].showTime) > 0) {
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // already sorted
        }
    }

    public static void display(MovieShow[] shows) {
        for (MovieShow m : shows) {
            System.out.println(m.movieName + " - " + m.showTime);
        }
    }
}

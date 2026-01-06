package com.bridgelabz.stackqueuehashmap.circulartour;

public class CircularTourMain {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = CircularTour.findStartingPoint(petrol, distance);

        System.out.println(start); // Output: 1
    }
}


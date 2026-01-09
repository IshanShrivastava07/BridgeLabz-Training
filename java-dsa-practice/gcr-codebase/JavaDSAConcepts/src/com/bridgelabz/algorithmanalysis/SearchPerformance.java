package com.bridgelabz.algorithmanalysis;

import java.util.Arrays;

public class SearchPerformance {

    // Linear Search: O(N)
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        System.out.println();
        return -1;
    }

    // Binary Search: O(log N) 
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // main method
    public static void main(String[] args) {
        int N = 1_000_000;
        int target = N - 1;

        /// data
        int[] data = new int[N];
        for (int i = 0; i < N; i++) data[i] = i;

        // Linear Search timing
        long start = System.nanoTime();
        linearSearch(data, target);
        long linearTime = System.nanoTime() - start;

        // Sort + Binary Search timing
        start = System.nanoTime();
        Arrays.sort(data);              
        binarySearch(data, target);     
        long binaryTime = System.nanoTime() - start;

        System.out.println("Linear Search Time (ns): " + linearTime);
        System.out.println("Binary Search Time (ns): " + binaryTime);
    }
}

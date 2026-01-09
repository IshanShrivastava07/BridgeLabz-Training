package com.bridgelabz.algorithmanalysis;

import java.util.Arrays;
import java.util.Random;

public class SortingPerformance {

    // Bubble Sort: O(N^2)
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort: O(N log N)
    static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Quick Sort: O(N log N) average
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int N = 10_000; // increase to test larger data
        int[] data = new Random().ints(N, 0, N).toArray();

        int[] a1 = data.clone();
        int[] a2 = data.clone();
        int[] a3 = data.clone();

        long start;

        start = System.nanoTime();
        bubbleSort(a1);
        System.out.println("Bubble Sort (ns): " + (System.nanoTime() - start));

        start = System.nanoTime();
        mergeSort(a2);
        System.out.println("Merge Sort (ns): " + (System.nanoTime() - start));

        start = System.nanoTime();
        quickSort(a3, 0, a3.length - 1);
        System.out.println("Quick Sort (ns): " + (System.nanoTime() - start));
    }
}

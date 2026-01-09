package com.bridgelabz.algorithmanalysis;

import java.util.*;

public class SearchDataStructureComparison {

    // Array search: O(N)
    static boolean searchArray(int[] arr, int target) {
        for (int x : arr) {
            if (x == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int N = 1_000_000;
        int target = N - 1;

        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Fill data structures
        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start;

        // Array search
        start = System.nanoTime();
        searchArray(array, target);
        System.out.println("Array search (ms): "
                + (System.nanoTime() - start) / 1_000_000);

        // HashSet search
        start = System.nanoTime();
        hashSet.contains(target);
        System.out.println("HashSet search (ms): "
                + (System.nanoTime() - start) / 1_000_000);

        // TreeSet search
        start = System.nanoTime();
        treeSet.contains(target);
        System.out.println("TreeSet search (ms): "
                + (System.nanoTime() - start) / 1_000_000);
    }
}


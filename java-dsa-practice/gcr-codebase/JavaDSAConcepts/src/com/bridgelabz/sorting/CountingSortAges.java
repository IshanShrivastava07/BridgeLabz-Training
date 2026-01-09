package com.bridgelabz.sorting;

public class CountingSortAges {

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 12, 16, 10};
        int min = 10, max = 18;

        int[] count = new int[max - min + 1];

        // Count frequency
        for (int age : ages) {
            count[age - min]++;
        }

        // Cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[ages.length];

        // Build output array (stable)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - min] - 1] = age;
            count[age - min]--;
        }

        for (int age : output) {
            System.out.print(age + " ");
        }
    }
}

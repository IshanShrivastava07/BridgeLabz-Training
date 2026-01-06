package com.bridgelabz.stackqueuehashmap.zerosumsubarray;

import java.util.List;

public class ZeroSumSubArrayMain {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, -4, -2, -2};

        List<int[]> subarrays = ZeroSumSubarray.findZeroSumSubarrays(arr);

        for (int[] pair : subarrays) {
            System.out.println("Start: " + pair[0] + ", End: " + pair[1]);
        }
    }
}

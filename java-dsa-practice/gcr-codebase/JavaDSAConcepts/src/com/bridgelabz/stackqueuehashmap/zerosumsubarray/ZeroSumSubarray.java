package com.bridgelabz.stackqueuehashmap.zerosumsubarray;

import java.util.*;

public class ZeroSumSubarray{

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        int sum = 0;
        map.put(0, new ArrayList<>(List.of(-1))); // base case

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }
}


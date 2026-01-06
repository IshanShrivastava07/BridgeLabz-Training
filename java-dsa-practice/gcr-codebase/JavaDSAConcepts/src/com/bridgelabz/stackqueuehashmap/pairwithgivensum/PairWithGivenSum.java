package com.bridgelabz.stackqueuehashmap.pairwithgivensum;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}


package com.bridgelabz.stackqueuehashmap.twosum;

public class TwoSumMain {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums, target);

        System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
        // Output: Index 1: 0, Index 2: 1
    }
}

package com.bridgelabz.search.binarysearch.challengesearch;

import java.util.Arrays;

class ChallengeSearch {

    // Linear search 
    static int firstMissingPositive(int[] arr) {
        boolean[] visited = new boolean[arr.length + 1];

        
        for (int num : arr) {
            if (num > 0 && num <= arr.length) {
                visited[num] = true;
            }
        }

        // Find the first missing positive number
        for (int i = 1; i <= arr.length; i++) {
          if (!visited[i]) {
            return i;
         }
      }

        
       return arr.length + 1;
    }

    // Binary search to find index of target element
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

         // target found
            if (arr[mid] == target) {
                return mid;                 
            } 
            
         // search right half
            else if (arr[mid] < target) {
                left = mid + 1;             
            } 
            // search left half
            else {
                right = mid - 1;           
            }
        }
     // target not found
        return -1;                          
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};

        // Linear Search 
        System.out.println(firstMissingPositive(arr)); // 2

        // Binary Search 
        Arrays.sort(arr); 
        System.out.println(binarySearch(arr, 4)); 
    }
}


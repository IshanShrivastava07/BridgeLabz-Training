package com.bridgelabz.search.binarysearch.firstnlastoccurence;

class FirstLastOccurrence {

    // Find first occurrence of target
    static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
            	//  answer found
                result = mid;    
             // move left 
                right = mid - 1;       
            } 
            else if (arr[mid] < target) {
                left = mid + 1;        // searching right half
            } 
            else {
                right = mid - 1;       // searching left half
            }
        }
        return result;
    }

    // Find last occurrence of target
    static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
            	// possible answer found
                result = mid; 
             // move right 
                left = mid + 1;        
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7};

        System.out.println(findFirst(arr, 4)); // 1
        System.out.println(findLast(arr, 4));  // 3
    }
}


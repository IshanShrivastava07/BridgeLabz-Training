package com.bridgelabz.search.binarysearch.rotationpoint;

class RotationPoint {
    static int findMin(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] > arr[r]) l = m + 1;
            else r = m;
        }
        return l;
    }
}


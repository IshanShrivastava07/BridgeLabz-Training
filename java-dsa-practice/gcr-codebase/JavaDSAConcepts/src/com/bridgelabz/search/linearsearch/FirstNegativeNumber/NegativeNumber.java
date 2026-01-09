package com.bridgelabz.search.linearsearch.FirstNegativeNumber;

class FirstNegative {
    static int find(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) return i;
        return -1;
    }
}


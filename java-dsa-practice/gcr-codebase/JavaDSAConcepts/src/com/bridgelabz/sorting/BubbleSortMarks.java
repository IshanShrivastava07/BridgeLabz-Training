package com.bridgelabz.sorting;

public class BubbleSortMarks {
    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 62, 55};

        int n = marks.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        // Sorted array 
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}

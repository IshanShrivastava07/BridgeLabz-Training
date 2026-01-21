package com.bridgelabz.sortingalgorithm.examcell;

public class ExamCellApp {
    public static void main(String[] args) {

        // Pre-sorted center-wise lists (descending)
        Student[] center1 = {
            new Student(101, "Amit", 96),
            new Student(102, "Neha", 90),
            new Student(103, "Ravi", 85)
        };

        Student[] center2 = {
            new Student(201, "Pooja", 98),
            new Student(202, "Karan", 92),
            new Student(203, "Sonal", 88)
        };

        Student[] center3 = {
            new Student(301, "Rahul", 97),
            new Student(302, "Isha", 91),
            new Student(303, "Nikhil", 86)
        };

        // Merge all centers into one array
        Student[] all = new Student[center1.length + center2.length + center3.length];
        int idx = 0;

        for (Student s : center1) all[idx++] = s;
        for (Student s : center2) all[idx++] = s;
        for (Student s : center3) all[idx++] = s;

        System.out.println("Before Sorting (Merged Centers):");
        MergeSorter.display(all);

        // Final rank list
        MergeSorter.mergeSort(all, 0, all.length - 1);

        System.out.println("\nFinal State-Level Rank List:");
        MergeSorter.display(all);
    }
}


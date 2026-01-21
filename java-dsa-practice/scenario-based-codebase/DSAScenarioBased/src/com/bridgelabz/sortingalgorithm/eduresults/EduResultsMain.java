package com.bridgelabz.sortingalgorithm.eduresults;

public class EduResultsMain {
    public static void main(String[] args) {

        // Pre-sorted district-wise lists (descending by score)
        Student[] district1 = {
            new Student(101, "Amit", 95),
            new Student(102, "Neha", 90),
            new Student(103, "Ravi", 85)
        };

        Student[] district2 = {
            new Student(201, "Pooja", 98),
            new Student(202, "Karan", 92),
            new Student(203, "Sonal", 88)
        };

        Student[] district3 = {
            new Student(301, "Rahul", 97),
            new Student(302, "Ishan", 91),
            new Student(303, "Nikhil", 85)
        };

        // Merge all districts into one list
        Student[] all = new Student[district1.length + district2.length + district3.length];
        int idx = 0;

        for (Student s : district1) all[idx++] = s;
        for (Student s : district2) all[idx++] = s;
        for (Student s : district3) all[idx++] = s;

        System.out.println("Before Final Sorting (Merged Districts):");
        MergeSort.display(all);

        // Final state-wise rank list
        MergeSort.mergesort(all, 0, all.length - 1);

        System.out.println("\nFinal State-Wise Rank List:");
        MergeSort.display(all);
    }
}

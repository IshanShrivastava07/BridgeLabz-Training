package com.bridgelabz.sortingalgorithm.zipzipmartMergeSort;

public class ZipZipMain {
    public static void main(String[] args) {

        Transaction[] records = {
            new Transaction("2026-01-18", 450.50),
            new Transaction("2026-01-17", 1200.00),
            new Transaction("2026-01-18", 300.00),
            new Transaction("2026-01-16", 999.99),
            new Transaction("2026-01-17", 250.75)
        };

        System.out.println("Before Sorting:");
        MergeSorter.display(records);

        MergeSorter.mergeSort(records, 0, records.length - 1);

        System.out.println("\nAfter Sorting (by Date, then Amount):");
        MergeSorter.display(records);
    }
}

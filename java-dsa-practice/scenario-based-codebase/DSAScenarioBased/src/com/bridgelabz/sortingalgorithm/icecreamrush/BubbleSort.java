package com.bridgelabz.sortingalgorithm.icecreamrush;

public class BubbleSort {

    // Bubble Sort by sales (descending: most popular first)
    public static void bubbleSort(Flavour[] flavours) {
        int n = flavours.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (flavours[j].sales < flavours[j + 1].sales) {
                    Flavour temp = flavours[j];
                    flavours[j] = flavours[j + 1];
                    flavours[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void display(Flavour[] flavours) {
        for (Flavour f : flavours) {
            System.out.println(f.name + " - Sold: " + f.sales);
        }
    }
}
							
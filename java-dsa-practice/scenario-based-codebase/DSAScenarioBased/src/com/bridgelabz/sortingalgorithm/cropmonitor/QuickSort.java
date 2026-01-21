package com.bridgelabz.sortingalgorithm.cropmonitor;

public class QuickSort {

    
    public static void quickSort(SensorData[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(SensorData[] arr, int low, int high) {
        String pivot = arr[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].timestamp.compareTo(pivot) <= 0) {
                i++;
                SensorData temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        SensorData temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void display(SensorData[] arr) {
        for (SensorData s : arr) {
            System.out.println(s.timestamp + " | " + s.temperature + "°C");
        }
    }
}



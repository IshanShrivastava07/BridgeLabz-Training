package com.bridgelabz.sortingalgorithm.cropmonitor;

public class CropMonitorMain {
	
	    public static void main(String[] args) {

	        SensorData[] readings = {
	            new SensorData("2026-01-19 10:05:12", 28.4),
	            new SensorData("2026-01-19 09:55:30", 27.9),
	            new SensorData("2026-01-19 10:15:45", 29.1),
	            new SensorData("2026-01-19 09:45:10", 26.8),
	            new SensorData("2026-01-19 10:00:00", 28.0)
	        };

	        System.out.println("Before Sorting:");
	        QuickSort.display(readings);

	        QuickSort.quickSort(readings, 0, readings.length - 1);

	        System.out.println("\nAfter Sorting (by Timestamp):");
	        QuickSort.display(readings);
	    }
	}



package com.bridgelabz.sortingalgorithm.cropmonitor;

public class SensorData {
    String timestamp; // Format: YYYY-MM-DD HH:MM:SS
    double temperature;

    public SensorData(String timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}


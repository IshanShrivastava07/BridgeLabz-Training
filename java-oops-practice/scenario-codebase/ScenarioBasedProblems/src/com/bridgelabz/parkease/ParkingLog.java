package com.bridgelabz.parkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingLog {

    private List<String> logs = new ArrayList<>();

    public void addEntry(String message) {
        logs.add(message);
    }

    public void showLogs() {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}

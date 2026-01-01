package com.bridgelabz.inheritance;

public class Device {
    String deviceId;
    boolean status;

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

package com.bridgelabz.inheritance;

public class Thermostat extends Device {
    int temperatureSetting;

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature: " + temperatureSetting + "°C");
    }
}

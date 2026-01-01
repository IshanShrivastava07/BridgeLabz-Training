package com.bridgelabz.inheritance;

public class SmartHomeMain {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId = "T101";
        t.status = true;
        t.temperatureSetting = 24;

        t.displayStatus();
    }
}

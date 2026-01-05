package com.bridgelabz.smarthomesystem;

public class AC extends Appliance {
    public void turnOn() {
        setStatus(true);
        System.out.println("AC Cooling Started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("AC Stopped");
    }
}


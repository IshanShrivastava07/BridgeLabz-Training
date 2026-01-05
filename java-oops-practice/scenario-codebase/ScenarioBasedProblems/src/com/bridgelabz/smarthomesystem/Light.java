package com.bridgelabz.smarthomesystem;


public class Light extends Appliance {
    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF");
    }
}

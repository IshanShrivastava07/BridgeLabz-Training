package com.bridgelabz.traincompanion;

public class Compartment {
    String name;          // Sleeper, Pantry, WiFi, AC
    Compartment prev;
    Compartment next;

    public Compartment(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}

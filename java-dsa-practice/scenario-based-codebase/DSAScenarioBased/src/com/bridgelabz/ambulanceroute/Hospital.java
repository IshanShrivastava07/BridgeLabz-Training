package com.bridgelabz.ambulanceroute;

public class Hospital {
    String name;
    boolean available;
    Hospital next;

    public Hospital(String name, boolean available) {
        this.name = name;
        this.available = available;
    }
}


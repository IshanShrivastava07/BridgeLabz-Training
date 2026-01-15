package com.bridgelabz.callcenter;

public class Customer {
    int id;
    String name;
    boolean isVIP;
    int priority;

    Customer next; // for queues

    Customer(int id, String name, boolean isVIP, int priority) {
        this.id = id;
        this.name = name;
        this.isVIP = isVIP;
        this.priority = priority;
        this.next = null;
    }
}

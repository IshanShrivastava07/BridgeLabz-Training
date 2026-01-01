package com.bridgelabz.inheritance;

public class Chef extends Person implements Worker {
    public void performDuties() {
        System.out.println("Chef prepares food");
    }
}

package com.bridgelabz.inheritance;

public class Author extends Book {
    String name;
    String bio;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

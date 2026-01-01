package com.bridgelabz.inheritance;

public class LibraryMain {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java Basics";
        a.publicationYear = 2024;
        a.name = "James";
        a.bio = "Java Developer";

        a.displayInfo();
    }
}

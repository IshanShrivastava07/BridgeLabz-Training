package com.bridgelabz.objectmodelling.levelone;

public class MainLibrary {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("OOP Concepts", "Robert");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib2.addBook(b1);
        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}

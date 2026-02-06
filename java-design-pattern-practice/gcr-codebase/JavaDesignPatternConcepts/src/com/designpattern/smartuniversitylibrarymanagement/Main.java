package com.designpattern.smartuniversitylibrarymanagement;

public class Main {

    public static void main(String[] args) {

        LibraryCatalog catalog = LibraryCatalog.getInstance();

        User u1 = UserFactory.createUser("student", "Ishan");
        User u2 = UserFactory.createUser("faculty", "Dr. Sharma");

        catalog.registerObserver(u1);
        catalog.registerObserver(u2);

        Book book = new Book.BookBuilder("\nData Structures by Cormen")
                .addAuthor("\nCormen")
                .addAuthor("\nLeiserson")
                .edition("\n3rd")
                .genre("\nComputer Science")
                .publisher("\nMIT Press")
                .build();

        catalog.addBook(book);
    }
}

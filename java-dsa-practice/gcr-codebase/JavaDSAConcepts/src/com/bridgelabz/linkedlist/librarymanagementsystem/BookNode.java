package com.bridgelabz.linkedlist.librarymanagementsystem;

public class BookNode {
	String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;

    BookNode prev;
    BookNode next;

    public BookNode(int bookId, String title, String author,
                    String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }
}

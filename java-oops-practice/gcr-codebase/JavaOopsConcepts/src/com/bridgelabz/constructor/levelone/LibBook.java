package com.bridgelabz.constructor.levelone;

public class LibBook {
    public String ISBN;
    protected String title;
    private String author;

    public LibBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

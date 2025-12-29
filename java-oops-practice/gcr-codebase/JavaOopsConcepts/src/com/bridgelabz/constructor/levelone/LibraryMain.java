package com.bridgelabz.constructor.levelone;

public class LibraryMain {
    public static void main(String[] args) {
        EBook eb = new EBook("ISBN01", "Java", "James");
        eb.setAuthor("James Gosling");
        System.out.println(eb.ISBN + " " + eb.title + " " + eb.getAuthor());
    }
}

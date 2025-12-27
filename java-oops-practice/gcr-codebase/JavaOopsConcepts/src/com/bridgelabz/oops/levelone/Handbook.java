package com.bridgelabz.oops.levelone;

public class Handbook {

    // Declaring variables
    String bookTitle;
    String bookAuthor;
    double price;

    // Constructor
    Handbook(String bookTitle, String bookAuthor, double price) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Title of the book: " + bookTitle);
        System.out.println("Author of the book: " + bookAuthor);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        Handbook book1 = new Handbook("2 States", "Chetan Bhagat", 500);
        Handbook book2 = new Handbook("Wings Of Fire", "A. P. J. Abdul Kalam", 500);

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}


package com.bridgelabz.constructor.levelone;

//  Book class with default and parameterized constructors
public class Book {
    String title, author;
    double price;

    Book() {
       title = "Unknown";
       author = "Unknown";
       price = 0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book b = new Book("1984", "George Orwell", 399);
        System.out.println(b.title + " " + b.author + " " + b.price);
        
    }
}
 
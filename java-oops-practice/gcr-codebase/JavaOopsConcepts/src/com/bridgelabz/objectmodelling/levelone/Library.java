package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

//Library aggregates Book objects
public class Library {
 String name;
 ArrayList<Book> books = new ArrayList<>();

 public Library(String name) {
     this.name = name;
 }

 public void addBook(Book book) {
     books.add(book);
 }

 public void showBooks() {
     System.out.println("Library: " + name);
     for (Book b : books) {
         System.out.println(b.title + " by " + b.author);
     }
 }
}


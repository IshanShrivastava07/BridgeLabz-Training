package com.bridgelabz.bookshelf;
import java.util.*;

public class BookShelf {

    // genre → list of books
    private Map<String, LinkedList<Book>> catalog = new HashMap<>();

    // to avoid duplicate books
    private Set<Integer> bookIds = new HashSet<>();

    // add book
    public void addBook(String genre, Book book) {
        if (bookIds.contains(book.id)) {
            System.out.println("Duplicate book not allowed");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        bookIds.add(book.id);
    }

    // borrow (remove) book
    public void borrowBook(String genre, int bookId) {
        LinkedList<Book> books = catalog.get(genre);
        if (books == null) return;

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            if (it.next().id == bookId) {
                it.remove();
                bookIds.remove(bookId);
                break;
            }
        }
    }

    // display catalog
    public void display() {
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  " + b.title + " - " + b.author);
            }
        }
    }
}

package com.designpattern.smartuniversitylibrarymanagement;

import java.util.*;

class LibraryCatalog {

    private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book.getTitle());
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(String bookName) {
        for (Observer o : observers) {
            o.update(bookName);
        }
    }
}

package com.bridgelabz.encapsulation;

// Book class
public class Book extends LibraryItem implements Reservable {

    private boolean isAvailable = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    // Books can be borrowed for 14 days
    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved successfully");
        } else {
            System.out.println("Book already reserved");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

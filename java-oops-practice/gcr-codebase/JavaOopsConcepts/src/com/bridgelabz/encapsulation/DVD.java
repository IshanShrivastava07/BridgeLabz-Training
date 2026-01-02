package com.bridgelabz.encapsulation;

// DVD class
public class DVD extends LibraryItem implements Reservable {

    private boolean isAvailable = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    // DVDs can be borrowed for 3 days
    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved successfully");
        } else {
            System.out.println("DVD already reserved");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

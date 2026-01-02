package com.bridgelabz.encapsulation;

// Magazine class
public class Magazine extends LibraryItem implements Reservable {

    private boolean isAvailable = true;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    // Magazines can be borrowed for 7 days
    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved successfully");
        } else {
            System.out.println("Magazine already reserved");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

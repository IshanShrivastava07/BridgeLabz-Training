package com.bridgelabz.encapsulation;

// Abstract class for all library items
public abstract class LibraryItem {

    // Private variables (Encapsulation)
    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (hidden)
    private String borrowerName;

    // Constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Controlled access to borrower data
    public void borrowItem(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowerInfo() {
        if (borrowerName == null) {
            return "Not borrowed";
        }
        return "Borrowed by: " + borrowerName;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println(getBorrowerInfo());
    }

    // Abstract method
    public abstract int getLoanDuration();
}

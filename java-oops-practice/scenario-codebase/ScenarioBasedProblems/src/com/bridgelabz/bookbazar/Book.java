package com.bridgelabz.bookbazar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock; // inventory must be protected

    // Normal book
    public Book(String title, String author, double price, int stock) {
        this(title, author, price, stock, false);
    }

    // Book with offer flag
    public Book(String title, String author, double price, int stock, boolean hasOffer) {
        this.title = title;
        this.author = author;
        this.price = hasOffer ? price * 0.9 : price; // optional offer
        this.stock = stock;
    }

    // Controlled inventory update
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}


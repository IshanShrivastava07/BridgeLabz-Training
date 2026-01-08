package com.bridgelabz.bookbazar;

public class OrderItem {

    private Book book;
    private int quantity;

    public OrderItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        double total = book.getPrice() * quantity;   // price × quantity
        double discount = book.applyDiscount(total); // polymorphism
        return total - discount;                      // total – discount
    }

    public boolean processItem() {
        return book.reduceStock(quantity);
    }

    public String getBookTitle() {
        return book.getTitle();
    }
}


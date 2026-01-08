package com.bridgelabz.bookbazar;

public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.15; // 15% discount
    }
}

package com.bridgelabz.bookbazar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.05; // 5% discount
    }
}


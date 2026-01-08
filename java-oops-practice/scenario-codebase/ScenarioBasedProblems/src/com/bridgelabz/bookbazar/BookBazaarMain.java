package com.bridgelabz.bookbazar;

public class BookBazaarMain {
    public static void main(String[] args) {

        Book ebook = new EBook("Clean Code", "Robert C. Martin", 500, 50);
        Book printed = new PrintedBook("Effective Java", "Joshua Bloch", 700, 20);

        Order order = new Order("Amit");

        order.addItem(new OrderItem(ebook, 2));
        order.addItem(new OrderItem(printed, 1));

        order.placeOrder();
    }
}

package com.bridgelabz.encapsulation;

// Groceries product class (No tax)
public class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    // 5% discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

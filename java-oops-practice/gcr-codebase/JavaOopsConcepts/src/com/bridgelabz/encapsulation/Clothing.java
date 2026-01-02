package com.bridgelabz.encapsulation;

// Clothing product class
public class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    // 20% discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    // 5% tax
    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

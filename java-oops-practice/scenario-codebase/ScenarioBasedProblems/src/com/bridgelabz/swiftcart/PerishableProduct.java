package com.bridgelabz.swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double calculateDiscount() {
        return price * 0.50;
    }
}


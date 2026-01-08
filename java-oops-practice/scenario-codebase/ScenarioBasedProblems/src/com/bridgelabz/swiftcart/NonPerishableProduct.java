package com.bridgelabz.swiftcart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double calculateDiscount() {
        return price * 0.30; 
    }
}

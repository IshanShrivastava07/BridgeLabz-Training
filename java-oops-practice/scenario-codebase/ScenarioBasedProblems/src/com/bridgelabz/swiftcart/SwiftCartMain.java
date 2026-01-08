package com.bridgelabz.swiftcart;

public class SwiftCartMain {
    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 100);
        Product bread = new PerishableProduct("Bread", 40);

        Cart cart = new Cart();

        cart.addProduct(milk, 2);
        cart.addProduct(rice, 1);
        cart.addProduct(bread, 1);

        cart.generateBill();
    }
}


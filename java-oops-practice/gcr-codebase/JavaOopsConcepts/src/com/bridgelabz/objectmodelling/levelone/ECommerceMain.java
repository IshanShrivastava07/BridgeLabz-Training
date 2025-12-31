package com.bridgelabz.objectmodelling.levelone;

public class ECommerceMain {
    public static void main(String[] args) {

    	 ECommerceCustomer  c1 = new ECommerceCustomer("Ishan");
        Order o1 = new Order();

        o1.addProduct(new Product("Laptop"));
        o1.addProduct(new Product("Mouse"));

        c1.placeOrder(o1);
    }
}


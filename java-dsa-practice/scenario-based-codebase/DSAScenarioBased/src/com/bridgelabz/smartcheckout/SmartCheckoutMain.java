package com.bridgelabz.smartcheckout;

import java.util.Arrays;

public class SmartCheckoutMain {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        checkout.addItem("Milk", 50, 5);
        checkout.addItem("Bread", 40, 3);

        checkout.addCustomer(
                new Customer("Amit", Arrays.asList("Milk", "Bread"))
        );
        checkout.addCustomer(
                new Customer("Neha", Arrays.asList("Milk"))
        );

        checkout.processCustomer();
        checkout.processCustomer();
    }
}


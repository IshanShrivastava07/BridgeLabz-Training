package com.bridgelabz.inheritance;

public class ShippedOrder extends Order {
    String trackingNumber;

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

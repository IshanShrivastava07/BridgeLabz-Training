package com.bridgelabz.inheritance;

public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

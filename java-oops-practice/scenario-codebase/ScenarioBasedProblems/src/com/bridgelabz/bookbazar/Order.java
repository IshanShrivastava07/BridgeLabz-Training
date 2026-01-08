package com.bridgelabz.bookbazar;


import java.util.*;

public class Order {

    private List<OrderItem> items = new ArrayList<>();
    private String userName;

    private String status; // restricted updates

    public Order(String userName) {
        this.userName = userName;
        this.status = "CREATED";
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    // Only internal process updates status
    private void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void placeOrder() {
        for (OrderItem item : items) {
            if (!item.processItem()) {
                updateStatus("FAILED");
                System.out.println("Order failed due to insufficient stock.");
                return;
            }
        }
        updateStatus("CONFIRMED");
        generateBill();
    }

    private void generateBill() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getItemTotal();
        }
        System.out.println("Order placed by: " + userName);
        System.out.println("Final Amount: " + total);
        System.out.println("Order Status: " + status);
    }
}

package com.bridgelabz.foodloop;

import java.util.ArrayList;

public class Order implements IOrderable {
    private ArrayList<FoodItem> items = new ArrayList<>();
    private double total;

    public Order(FoodItem... foodItems) { // combo meal constructor
        for (FoodItem item : foodItems) {
            items.add(item);
        }
    }

    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        double discount = items.get(0).applyDiscount(total);
        total -= discount;
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed! Total amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }
}

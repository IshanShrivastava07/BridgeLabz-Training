package com.bridgelabz.encapsulation;

// Non-veg food item
public class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    // Extra charge for non-veg items
    @Override
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
        return basePrice + 50; // additional non-veg charge
    }

    // 5% discount on non-veg items
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on Non-Veg items";
    }
}

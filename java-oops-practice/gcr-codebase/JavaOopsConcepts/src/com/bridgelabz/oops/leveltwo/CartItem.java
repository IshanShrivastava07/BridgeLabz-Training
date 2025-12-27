package com.bridgelabz.oops.leveltwo;

public class CartItem {

    // Item attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add items
    public void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " " + itemName);
    }

    // Method to remove items
    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Removed " + qty + " " + itemName);
        } else {
            System.out.println("Not enough quantity");
        }
    }

    // Method to calculate total cost
    public double totalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 999.99, 1);
        item.addItem(2);
        item.removeItem(1);
        System.out.println("Total cost: $" + item.totalCost());
    }
}

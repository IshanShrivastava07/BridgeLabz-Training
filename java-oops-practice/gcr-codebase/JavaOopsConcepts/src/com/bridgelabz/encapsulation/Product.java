package com.bridgelabz.encapsulation;

// Abstract class for all products
public abstract class Product {

    // Private variables (Encapsulation)
    private int productId;
    private String name;
    private double price;

    // Constructor to initialize product details
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter methods (to read values safely)
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter method (to update price)
    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method (must be implemented by child classes)
    public abstract double calculateDiscount();
}

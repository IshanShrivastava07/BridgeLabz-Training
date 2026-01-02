package com.bridgelabz.encapsulation;

// Main class
public class ECommerceMain {

    // Method showing polymorphism
    public static void calculateFinalPrice(Product[] products) {

        for (Product p : products) {

            double tax = 0;

            // Check if product is taxable
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Base Price: ₹" + p.getPrice());
            System.out.println("Tax: ₹" + tax);
            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {

        Product p1 = new Electronics(1, "Laptop", 60000);
        Product p2 = new Clothing(2, "Jacket", 4000);
        Product p3 = new Groceries(3, "Rice Bag", 1200);

        Product[] products = { p1, p2, p3 };

        calculateFinalPrice(products);
    }
}

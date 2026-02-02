package com.lambdafunction.ecommerce;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    int discount;

    Product(String name, double price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | ₹" + price + " | rating " + rating + " | " + discount + "% off";
    }
}

public class EcommerceSort {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Phone", 20000, 4.5, 10),
                new Product("Laptop", 60000, 4.7, 20),
                new Product("Headphones", 3000, 4.2, 30)
        );

        // Sort by price
        products.stream()
                .sorted((p1, p2) -> Double.compare(p1.price, p2.price))
                .forEach(System.out::println);

        // Sort by rating
        products.stream()
                .sorted((p1, p2) -> Double.compare(p2.rating, p1.rating))
                .forEach(System.out::println);
    }
}

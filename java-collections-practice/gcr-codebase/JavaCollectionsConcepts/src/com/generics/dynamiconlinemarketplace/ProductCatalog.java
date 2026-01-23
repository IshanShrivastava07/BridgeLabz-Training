package com.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

// Catalog that can store any type of Product safely
public class ProductCatalog {

    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void displayAll() {
        for (Product<? extends Category> p : products) {
            System.out.println(
                    p.getName() + " | " +
                    p.getCategory().getName() + " | Price: " +
                    p.getPrice()
            );
        }
    }
}

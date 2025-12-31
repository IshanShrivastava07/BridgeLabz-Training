package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

//Order aggregates Products
public class Order {
 ArrayList<Product> products = new ArrayList<>();

 public void addProduct(Product p) {
     products.add(p);
 }
}


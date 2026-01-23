package com.generics.dynamiconlinemarketplace;

//Utility class with generic method
public class MarketplaceUtil {

 // Generic Method with bounded type parameter
 public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

     double discount = product.getPrice() * (percentage / 100);
     double newPrice = product.getPrice() - discount;

     product.setPrice(newPrice);

     System.out.println("Discount applied to " + product.getName() +
             " | New Price: " + newPrice);
 }
}


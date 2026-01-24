package com.collection.mapBasedQuestions.shoppingCart;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        Map<String, Integer> priceMap = new HashMap<>();
        Map<String, Integer> orderMap = new LinkedHashMap<>();
        TreeMap<Integer, String> sortedByPrice = new TreeMap<>();

        priceMap.put("Pen", 10);
        priceMap.put("Book", 50);
        priceMap.put("Bag", 30);

        orderMap.putAll(priceMap);

        for (String item : priceMap.keySet()) {
            sortedByPrice.put(priceMap.get(item), item);
        }

        System.out.println("Insertion Order: " + orderMap);
        System.out.println("Sorted by Price: " + sortedByPrice);
    }
}

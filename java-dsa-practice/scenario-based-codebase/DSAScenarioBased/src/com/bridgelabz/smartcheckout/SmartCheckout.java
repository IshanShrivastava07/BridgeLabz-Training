package com.bridgelabz.smartcheckout;

import java.util.*;

public class SmartCheckout {

    Queue<Customer> queue = new LinkedList<>();
    Map<String, Integer> priceMap = new HashMap<>();
    Map<String, Integer> stockMap = new HashMap<>();

    public void addItem(String item, int price, int stock) {
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
    }

    public void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = queue.poll();
        int total = 0;

        for (String item : c.items) {
            if (stockMap.getOrDefault(item, 0) > 0) {
                total += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            }
        }

        System.out.println(c.name + " total bill: ₹" + total);
    }
}

package com.collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
    String getCustomer() { return customer; }
    double getAmount() { return amount; }
}

public class OrderRevenueMain {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order("Ishan", 1200.50),
            new Order("Ravi", 800.00),
            new Order("Ishan", 450.75),
            new Order("Neha", 999.99)
        );

        Map<String, Double> revenueByCustomer =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      Order::getCustomer,
                      Collectors.summingDouble(Order::getAmount)
                  ));

        revenueByCustomer.forEach((customer, total) ->
            System.out.println(customer + " -> " + total)
        );
    }
}

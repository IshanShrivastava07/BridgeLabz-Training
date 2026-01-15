package com.bridgelabz.smartcheckout;

import java.util.List;

public class Customer {
    String name;
    List<String> items;

    public Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}

package com.generics.warehouseitems;

import java.util.ArrayList;
import java.util.List;

// Generic class with bounded type parameter
public class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
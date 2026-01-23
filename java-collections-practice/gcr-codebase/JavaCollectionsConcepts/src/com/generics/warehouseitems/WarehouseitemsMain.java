package com.generics.warehouseitems;

public class WarehouseitemsMain {

    public static void main(String[] args) {

        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();	
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics Items:");
        WarehouseUtil.displayItems(electronicStorage.getItems());

        System.out.println("\nGrocery Items:");
        WarehouseUtil.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture Items:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}

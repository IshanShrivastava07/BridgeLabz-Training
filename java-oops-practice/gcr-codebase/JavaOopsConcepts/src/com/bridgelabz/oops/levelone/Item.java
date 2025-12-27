package com.bridgelabz.oops.levelone;

public class Item {

    // Declaring arrays to store item details
    String[] itemCode;
    String[] itemName;
    double[] price;

    // Constructor to initialize item details
    Item(String[] itemName, String[] itemCode, double[] price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItems(int i) {
        System.out.println("itemCode : " + itemCode[i]);
        System.out.println("itemPrice : " + price[i]);
        System.out.println("itemName : " + itemName[i]);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        String[] itemName = {"Water bottle", "Rice", "Blackboard"};
        String[] itemCode = {"01AA", "01BB", "02AA"};
        double[] price = {500, 700, 400};

        Item items = new Item(itemName, itemCode, price);

        for (int i = 0; i < price.length; i++) {
            items.displayItems(i);
        }
    }
}

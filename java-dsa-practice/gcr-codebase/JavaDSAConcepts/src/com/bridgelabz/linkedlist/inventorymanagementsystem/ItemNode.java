package com.bridgelabz.linkedlist.inventorymanagementsystem;

public class ItemNode {
	
	int itemId;
    String itemName;
    int quantity;
    double price;

    ItemNode next;

    public ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
}

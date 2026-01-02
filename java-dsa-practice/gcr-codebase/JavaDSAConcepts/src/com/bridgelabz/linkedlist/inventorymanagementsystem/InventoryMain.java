package com.bridgelabz.linkedlist.inventorymanagementsystem;

public class InventoryMain {

	public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 60000);
        inventory.addAtEnd(102, "Mouse", 20, 500);
        inventory.addAtBeginning(103, "Keyboard", 10, 1500);

        System.out.println("Inventory:");
        inventory.display();

        inventory.updateQuantity(102, 25);
        inventory.searchById(101);

        System.out.println("\nTotal Inventory Value: " +
                inventory.calculateTotalValue());

        System.out.println("\nSorted by Name (ASC):");
        inventory.sortByName(true);
        inventory.display();

        System.out.println("\nSorted by Price (DESC):");
        inventory.sortByPrice(false);
        inventory.display();
    }
}

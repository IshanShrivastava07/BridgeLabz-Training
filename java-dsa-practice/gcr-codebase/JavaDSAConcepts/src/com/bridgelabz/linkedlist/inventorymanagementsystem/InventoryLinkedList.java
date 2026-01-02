package com.bridgelabz.linkedlist.inventorymanagementsystem;

public class InventoryLinkedList {

	 private ItemNode head;

	    // Add at beginning
	    public void addAtBeginning(int id, String name, int qty, double price) {
	        ItemNode node = new ItemNode(id, name, qty, price);
	        node.next = head;
	        head = node;
	    }

	    // Add at end
	    public void addAtEnd(int id, String name, int qty, double price) {
	        ItemNode node = new ItemNode(id, name, qty, price);
	        if (head == null) {
	            head = node;
	            return;
	        }
	        ItemNode temp = head;
	        while (temp.next != null) temp = temp.next;
	        temp.next = node;
	    }

	    // Add at position (1-based)
	    public void addAtPosition(int pos, int id, String name, int qty, double price) {
	        if (pos == 1) {
	            addAtBeginning(id, name, qty, price);
	            return;
	        }

	        ItemNode temp = head;
	        for (int i = 1; i < pos - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) return;

	        ItemNode node = new ItemNode(id, name, qty, price);
	        node.next = temp.next;
	        temp.next = node;
	    }

	    // Remove by Item ID
	    public void removeByItemId(int id) {
	        if (head == null) return;

	        if (head.itemId == id) {
	            head = head.next;
	            return;
	        }

	        ItemNode temp = head;
	        while (temp.next != null && temp.next.itemId != id) {
	            temp = temp.next;
	        }

	        if (temp.next != null)
	            temp.next = temp.next.next;
	    }

	    // Update quantity
	    public void updateQuantity(int id, int newQty) {
	        ItemNode temp = head;
	        while (temp != null) {
	            if (temp.itemId == id) {
	                temp.quantity = newQty;
	                return;
	            }
	            temp = temp.next;
	        }
	    }

	    // Search by ID
	    public void searchById(int id) {
	        ItemNode temp = head;
	        while (temp != null) {
	            if (temp.itemId == id) {
	                printItem(temp);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found");
	    }

	    // Search by name
	    public void searchByName(String name) {
	        ItemNode temp = head;
	        while (temp != null) {
	            if (temp.itemName.equalsIgnoreCase(name)) {
	                printItem(temp);
	            }
	            temp = temp.next;
	        }
	    }

	    // Total inventory value
	    public double calculateTotalValue() {
	        double total = 0;
	        ItemNode temp = head;
	        while (temp != null) {
	            total += temp.price * temp.quantity;
	            temp = temp.next;
	        }
	        return total;
	    }

	    // Sort by name
	    public void sortByName(boolean ascending) {
	        head = mergeSort(head, ascending, true);
	    }

	    // Sort by price
	    public void sortByPrice(boolean ascending) {
	        head = mergeSort(head, ascending, false);
	    }

	    // Merge Sort for Linked List
	    private ItemNode mergeSort(ItemNode h, boolean asc, boolean byName) {
	        if (h == null || h.next == null) return h;

	        ItemNode mid = getMiddle(h);
	        ItemNode nextMid = mid.next;
	        mid.next = null;

	        ItemNode left = mergeSort(h, asc, byName);
	        ItemNode right = mergeSort(nextMid, asc, byName);

	        return merge(left, right, asc, byName);
	    }

	    private ItemNode merge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
	        if (a == null) return b;
	        if (b == null) return a;

	        boolean condition;
	        if (byName)
	            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
	                            : a.itemName.compareToIgnoreCase(b.itemName) > 0;
	        else
	            condition = asc ? a.price <= b.price : a.price > b.price;

	        if (condition) {
	            a.next = merge(a.next, b, asc, byName);
	            return a;
	        } else {
	            b.next = merge(a, b.next, asc, byName);
	            return b;
	        }
	    }

	    private ItemNode getMiddle(ItemNode h) {
	        ItemNode slow = h, fast = h.next;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }

	    // Display all items
	    public void display() {
	        ItemNode temp = head;
	        while (temp != null) {
	            printItem(temp);
	            temp = temp.next;
	        }
	    }

	    private void printItem(ItemNode i) {
	        System.out.println(i.itemId + " | " + i.itemName + " | Qty: " +
	                i.quantity + " | Price: " + i.price);
	    }
	
}

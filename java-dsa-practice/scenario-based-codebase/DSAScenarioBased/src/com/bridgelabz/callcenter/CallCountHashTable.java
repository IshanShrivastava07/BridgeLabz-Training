package com.bridgelabz.callcenter;

public class CallCountHashTable {

    private HashNode[] table;
    private int size = 10;

    public CallCountHashTable() {
        table = new HashNode[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void incrementCall(int customerId) {
        int index = hash(customerId);

        HashNode current = table[index];

        while (current != null) {
            if (current.customerId == customerId) {
                current.count++;
                return;
            }
            current = current.next;
        }

        HashNode newNode = new HashNode(customerId);
        newNode.next = table[index];
        table[index] = newNode;
    }

    public int getCallCount(int customerId) {
        int index = hash(customerId);
        HashNode current = table[index];

        while (current != null) {
            if (current.customerId == customerId)
                return current.count;
            current = current.next;
        }
        return 0;
    }
}


package com.bridgelabz.callcenter;

public class HashNode {
    int customerId;
    int count;
    HashNode next;

    HashNode(int customerId) {
        this.customerId = customerId;
        this.count = 1;
        this.next = null;
    }
}

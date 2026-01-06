package com.bridgelabz.stackqueuehashmap.customhashmap;

import java.util.LinkedList;

public class CustomHashMap {

    private static class Node {
        int key;
        int value;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10;
    private LinkedList<Node>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    // Insert or update
    public void put(int key, int value) {
        int index = hash(key);
        for (Node node : buckets[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        buckets[index].add(new Node(key, value));
    }

    // Retrieve value
    public Integer get(int key) {
        int index = hash(key);
        for (Node node : buckets[index]) {
            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }

    // Delete key
    public void remove(int key) {
        int index = hash(key);
        buckets[index].removeIf(node -> node.key == key);
    }
}

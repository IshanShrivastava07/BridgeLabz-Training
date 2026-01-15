package com.bridgelabz.examproctor;

public class AnswerMap {
    private int[] keys;
    private String[] values;
    private int size;

    public AnswerMap(int capacity) {
        keys = new int[capacity];
        values = new String[capacity];
        size = 0;
    }

    public void put(int key, String value) {
        for (int i = 0; i < size; i++) {
            if (keys[i] == key) {
                values[i] = value;
                return;
            }
        }
        keys[size] = key;
        values[size] = value;
        size++;
    }

    public String get(int key) {
        for (int i = 0; i < size; i++) {
            if (keys[i] == key)
                return values[i];
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public int getKeyAt(int index) {
        return keys[index];
    }
}

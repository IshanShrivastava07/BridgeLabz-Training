package com.collection.map;

import java.util.*;

public class MaxValueKey {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;
        int max = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxKey = key;
            }
        }

        System.out.println(maxKey);   // B
    }
}

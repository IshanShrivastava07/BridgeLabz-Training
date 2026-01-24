package com.collection.mapBasedQuestions.VotingSystem;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();
        Map<String, Integer> order = new LinkedHashMap<>();

        votes.put("Alice", 3);
        votes.put("Bob", 5);
        votes.put("Carol", 2);

        order.putAll(votes);

        // Sorted by candidate name
        TreeMap<String, Integer> sorted = new TreeMap<>(votes);

        System.out.println("Insertion Order: " + order);
        System.out.println("Sorted Result: " + sorted);
    }
}

package com.collection.mapBasedQuestions;

import java.util.*;

public class BankingSystem {

    public static void main(String[] args) {

        Map<Integer, Integer> accounts = new HashMap<>();
        TreeMap<Integer, Integer> sorted = new TreeMap<>();
        Queue<Integer> withdrawQueue = new LinkedList<>();

        accounts.put(101, 5000);
        accounts.put(102, 3000);
        accounts.put(103, 7000);

        // sort by account number (simple version)
        sorted.putAll(accounts);

        // withdrawal requests
        withdrawQueue.add(101);
        withdrawQueue.add(103);

        while (!withdrawQueue.isEmpty()) {
            int acc = withdrawQueue.remove();
            accounts.put(acc, accounts.get(acc) - 1000);
        }

        System.out.println("Accounts: " + accounts);
        System.out.println("Sorted Accounts: " + sorted);
    }
}


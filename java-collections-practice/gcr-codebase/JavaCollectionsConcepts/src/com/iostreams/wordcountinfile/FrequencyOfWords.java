package com.iostreams.wordcountinfile;

import java.io.*;
import java.util.*;

public class FrequencyOfWords {

    public static void main(String[] args) {

        String file = "input.txt";
        HashMap<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort by frequency
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a, b) -> b.getValue() - a.getValue());

            System.out.println("Top 5 most frequent words:");

            for (int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


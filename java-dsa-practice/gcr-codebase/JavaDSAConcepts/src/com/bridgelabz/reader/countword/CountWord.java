package com.bridgelabz.reader.countword;

import java.io.*;

class CountWord {
    public static void main(String[] args) throws Exception {
        String target = "java";
        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            for (String word : line.split("\\s+")) {
                if (word.equalsIgnoreCase(target)) count++;
            }
        }
        br.close();
        System.out.println(count);
    }
}

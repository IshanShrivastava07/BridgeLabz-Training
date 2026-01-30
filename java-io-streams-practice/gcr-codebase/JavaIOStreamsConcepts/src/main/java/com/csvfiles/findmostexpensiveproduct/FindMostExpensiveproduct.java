package com.csvfiles.findmostexpensiveproduct;

import java.io.*;

public class FindMostExpensiveproduct {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("products.csv"));
        String line;
        br.readLine();

        String product = "";
        int maxPrice = 0;

        while ((line = br.readLine()) != null) {
            String[] p = line.split(",");
            int price = Integer.parseInt(p[3]);

            if (price > maxPrice) {
                maxPrice = price;
                product = p[1];
            }
        }

        br.close();
        System.out.println("Most Expensive: " + product + " -> " + maxPrice);
    }
}

package com.csvfiles.lowstock;

import java.io.*;

public class LowStock {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("products.csv"));
        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] p = line.split(",");
            int stock = Integer.parseInt(p[4]);

            if (stock < 30) {
                System.out.println(p[1] + " -> Stock: " + stock);
            }
        }

        br.close();
    }
}

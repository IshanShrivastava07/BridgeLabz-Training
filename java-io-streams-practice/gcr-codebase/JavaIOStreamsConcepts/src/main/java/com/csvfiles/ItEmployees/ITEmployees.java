package com.csvfiles.ItEmployees;

import java.io.*;

public class ITEmployees {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/csvfiles/ItEmployees/employe.csv"));
        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] e = line.split(",");

            if (e[2].equalsIgnoreCase("IT")) {
                System.out.println(e[1] + " - " + e[3]);
            }
        }

        br.close();
    }
}

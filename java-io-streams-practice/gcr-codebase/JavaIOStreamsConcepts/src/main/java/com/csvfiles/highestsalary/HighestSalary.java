package com.csvfiles.highestsalary;

import java.io.*;

public class HighestSalary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/csvfiles/ItEmployees/employe.csv"));
        String line;
        br.readLine();

        String maxName = "";
        int maxSalary = 0;

        while ((line = br.readLine()) != null) {
            String[] e = line.split(",");
            int salary = Integer.parseInt(e[3]);

            if (salary > maxSalary) {
                maxSalary = salary;
                maxName = e[1];
            }
        }

        br.close();
        System.out.println("Highest Paid: " + maxName + " -> " + maxSalary);
    }
}

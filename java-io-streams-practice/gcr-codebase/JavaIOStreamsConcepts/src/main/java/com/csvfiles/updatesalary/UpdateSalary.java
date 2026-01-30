package com.csvfiles.updatesalary;

import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/csvfiles/ItEmployees/employe.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated_employees.csv"));

        String line = br.readLine(); 
        bw.write(line + "\n");

        while ((line = br.readLine()) != null) {
            String[] e = line.split(",");
            int exp = Integer.parseInt(e[4]);
            int salary = Integer.parseInt(e[3]);

            if (exp >= 5) {
                salary = salary + (salary * 10 / 100);
                e[3] = String.valueOf(salary);
            }

            bw.write(String.join(",", e) + "\n");
        }

        br.close();
        bw.close();
        System.out.println("Updated file created.");
    }
}

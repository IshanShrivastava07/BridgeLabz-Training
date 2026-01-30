package com.csvfiles.jsonTocsv;

import java.io.*;

public class JSONToCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.json"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"));

        bw.write("ID,Name,Marks\n");
        String line;

        while ((line = br.readLine()) != null) {
            if (line.contains("id")) {
                String id = line.split(":")[1].replace(",", "").trim();
                String name = br.readLine().split(":")[1].replace(",", "").replace("\"", "").trim();
                String marks = br.readLine().split(":")[1].replace("}", "").trim();

                bw.write(id + "," + name + "," + marks + "\n");
            }
        }

        br.close();
        bw.close();
    }
}

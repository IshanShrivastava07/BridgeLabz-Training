package com.csvfiles.mergecsv;

import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws Exception {
        Map<String, String[]> map = new HashMap<>();

        BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
        br1.readLine();
        String line;

        while ((line = br1.readLine()) != null) {
            map.put(line.split(",")[0], line.split(","));
        }
        br1.close();

        BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("merged_students.csv"));

        bw.write("ID,Name,Age,Marks,Grade\n");
        br2.readLine();

        while ((line = br2.readLine()) != null) {
            String[] s2 = line.split(",");
            String[] s1 = map.get(s2[0]);

            bw.write(s1[0] + "," + s1[1] + "," + s1[2] + "," + s2[1] + "," + s2[2] + "\n");
        }

        br2.close();
        bw.close();
    }
}


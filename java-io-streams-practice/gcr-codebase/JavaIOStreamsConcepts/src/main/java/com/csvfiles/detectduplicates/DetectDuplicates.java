package com.csvfiles.detectduplicates;

import java.io.*;
import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        Set<String> seen = new HashSet<>();

        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String id = line.split(",")[0];

            if (!seen.add(id)) {
                System.out.println("Duplicate: " + line);
            }
        }

        br.close();
    }
}


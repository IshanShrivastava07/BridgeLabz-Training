package com.csvfiles.CSVToObjects;

import java.io.*;
import java.util.*;

public class CSVToObjects {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        List<Student> list = new ArrayList<>();

        String line = br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            list.add(new Student(
                    Integer.parseInt(s[0]),
                    s[1],
                    Integer.parseInt(s[2]),
                    Integer.parseInt(s[3])
            ));
        }

        br.close();

        for (Student s : list)
            System.out.println(s);
    }
}

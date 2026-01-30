package com.csvfiles.FilterMarks;

import java.io.*;

public class FilterMarks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/csvfiles/readStudents/students.csv"));
        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            int marks = Integer.parseInt(s[3]);

            if (marks > 80) {
                System.out.println(s[1] + " -> " + marks);
            }
        }
        br.close();
    }
}

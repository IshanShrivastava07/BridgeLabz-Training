package com.csvfiles.readStudents;

import java.io.*;

public class ReadStudents {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/csvfiles/readStudents/students.csv"));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            System.out.println("ID: " + s[0] + ", Name: " + s[1] +
                    ", Age: " + s[2] + ", Marks: " + s[3] + ", City: " + s[4]);
        }

        br.close();
    }
}

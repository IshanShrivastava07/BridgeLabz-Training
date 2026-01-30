package com.csvfiles.searchstudents;

import java.io.*;
import java.util.*;

public class SearchStudent {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/csvfiles/readStudents/students.csv"));
        String line;
        br.readLine();

        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");

            if (s[1].equalsIgnoreCase(name)) {
                System.out.println("ID: " + s[0]);
                System.out.println("Age: " + s[2]);
                System.out.println("Marks: " + s[3]);
                System.out.println("City: " + s[4]);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Student not found");

        br.close();
    }
}

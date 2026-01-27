package com.exceptionhandling.tryresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {

    public static void main(String[] args) {

        // try-with-resources automatically closes BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            String firstLine = br.readLine();
            System.out.println(firstLine);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
	
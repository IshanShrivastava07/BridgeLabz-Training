package com.bridgelabz.algorithmanalysis;

import java.io.*;

public class FileReadingPerformance {

    // FileReader: character stream
    static void readUsingFileReader(String path) throws Exception {
        FileReader reader = new FileReader(path);
        int ch;
        while ((ch = reader.read()) != -1) {
            // reading character by character
        }
        reader.close();
    }

    // InputStreamReader: byte stream → character conversion
    static void readUsingInputStreamReader(String path) throws Exception {
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(path));
        int ch;
        while ((ch = reader.read()) != -1) {
            // reading bytes converted to characters
        }
        reader.close();
    }

    public static void main(String[] args) throws Exception {
        String filePath = "largefile.txt"; // assume large file exists

        long start;

        start = System.nanoTime();
        readUsingFileReader(filePath);
        System.out.println("FileReader time (ms): "
                + (System.nanoTime() - start) / 1_000_000);

        start = System.nanoTime();
        readUsingInputStreamReader(filePath);
        System.out.println("InputStreamReader time (ms): "
                + (System.nanoTime() - start) / 1_000_000);
    }
}


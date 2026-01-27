package com.iostreams.bufferedfilehandling;

import java.io.*;

public class UnbufferedCopy {

    public static void main(String[] args) {
    	// put your large file here
        String source = "C:\\Users\\Hp\\OneDrive\\Desktop\\Java Programming Workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\iostreams\\bufferedfilehandling\\source.txt";        
        String destination = "unbuffered.txt";

        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[4096];   // 4 KB chunk
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        System.out.println("Unbuffered Time (ms): " + (endTime - startTime) / 1_000_000);
    }
}

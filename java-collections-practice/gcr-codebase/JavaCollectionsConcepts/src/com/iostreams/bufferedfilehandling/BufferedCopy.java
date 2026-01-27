package com.iostreams.bufferedfilehandling;

import java.io.*;

public class BufferedCopy {

    public static void main(String[] args) {
    	//large file
        String source = "C:\\Users\\Hp\\OneDrive\\Desktop\\Java Programming Workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\iostreams\\bufferedfilehandling\\source.txt";        
        String destination = "buffered.txt";

        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096];   // 4 KB chunk
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        System.out.println("Buffered Time (ms): " + (endTime - startTime) / 1_000_000);
    }
}


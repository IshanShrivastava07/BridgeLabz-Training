package com.junit.filehandling;

import java.io.*;
public class Filehandling {

    public void writeToFile(String filename, String content) throws IOException {
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(content);
        }
    }

    public String readFromFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        return br.readLine();
    }
}

package com.csvfiles.encryptionDecryption;

import java.io.*;
import java.util.Base64;

public class EncryptCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/csvfiles/ItEmployees/employe.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("encrypted.csv"));

        bw.write(br.readLine() + "\n");
        String line;

        while ((line = br.readLine()) != null) {
            String[] e = line.split(",");
            String enc = Base64.getEncoder().encodeToString(e[2].getBytes());
            bw.write(e[0] + "," + e[1] + "," + enc + "\n");
        }

        br.close();
        bw.close();
    }
}
 
package com.csvfiles.encryptionDecryption;

import java.io.*;
import java.util.Base64;

public class DecryptCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("encrypted.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] e = line.split(",");
            String salary = new String(Base64.getDecoder().decode(e[2]));
            System.out.println(e[0] + " " + e[1] + " Salary: " + salary);
        }

        br.close();
    }
}


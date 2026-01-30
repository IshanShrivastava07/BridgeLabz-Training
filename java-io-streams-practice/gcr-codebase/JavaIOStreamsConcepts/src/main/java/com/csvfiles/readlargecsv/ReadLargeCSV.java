package com.csvfiles.readlargecsv;

import java.io.*;

public class ReadLargeCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("large.csv"));
        String line;
        int count = 0, batch = 0;

        br.readLine(); // header

        while ((line = br.readLine()) != null) {
            count++;
            batch++;

            if (batch == 100) {
                System.out.println("Processed: " + count);
                batch = 0;
            }
        }

        br.close();
        System.out.println("Total records: " + count);
    }
}

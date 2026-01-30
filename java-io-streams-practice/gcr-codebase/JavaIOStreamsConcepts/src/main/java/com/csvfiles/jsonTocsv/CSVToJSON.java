package com.csvfiles.jsonTocsv;

import java.io.*;

public class CSVToJSON {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("students.json"));

        bw.write("[\n");
        br.readLine();
        String line;
        boolean first = true;

        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");

            if (!first) bw.write(",\n");
            bw.write(" {\"id\":" + s[0] + ",\"name\":\"" + s[1] + "\",\"marks\":" + s[2] + "}");
            first = false;
        }

        bw.write("\n]");
        br.close();
        bw.close();
    }
}

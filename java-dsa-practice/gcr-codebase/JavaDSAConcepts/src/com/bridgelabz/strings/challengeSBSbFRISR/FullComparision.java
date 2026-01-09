package com.bridgelabz.strings.challengeSBSbFRISR;

import java.io.*;

class FullComparison {
    public static void main(String[] args) throws Exception {

        int n = 1_000_000;

        long t1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        System.out.println("SB time: " + (System.nanoTime() - t1));

        t1 = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("hello");
        System.out.println("SBuffer time: " + (System.nanoTime() - t1));

        BufferedReader br = new BufferedReader(new FileReader("bigfile.txt"));
        int words = 0;
        String line;

        while ((line = br.readLine()) != null) {
            words += line.split("\\s+").length;
        }
        br.close();
        System.out.println("Word count: " + words);
    }
}


package com.bridgelabz.algorithmanalysis;

public class StringConcatenation {

    static void usingString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "a"; // creates new object every time → O(N^2)
        }
    }

    static void usingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a"); // mutable → O(N)
        }
    }

    static void usingStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a"); // thread-safe → O(N)
        }
    }

    public static void main(String[] args) {
        int N = 100_000; // try increasing

        long start;

        start = System.nanoTime();
        usingString(N);
        System.out.println("String time (ns): " + (System.nanoTime() - start));

        start = System.nanoTime();
        usingStringBuilder(N);
        System.out.println("StringBuilder time (ns): " + (System.nanoTime() - start));

        start = System.nanoTime();
        usingStringBuffer(N);
        System.out.println("StringBuffer time (ns): " + (System.nanoTime() - start));
    }
}

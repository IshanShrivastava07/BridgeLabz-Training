package com.bridgelabz.strings.stringbuffer.comparision;

class PerformanceComparision{
    public static void main(String[] args) {
        int n = 1_000_000;

        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        long sbTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("hello");
        long sbufTime = System.nanoTime() - start;

        System.out.println("StringBuilder: " + sbTime);
        System.out.println("StringBuffer : " + sbufTime);
    }
}

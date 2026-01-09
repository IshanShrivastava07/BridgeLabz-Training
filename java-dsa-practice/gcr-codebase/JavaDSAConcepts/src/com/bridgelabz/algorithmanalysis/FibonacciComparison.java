package com.bridgelabz.algorithmanalysis;

public class FibonacciComparison {

    // Recursive Fibonacci: O(2^N)
    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci: O(N)
    static int fibonacciIterative(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int N = 30;

        long start;

        start = System.nanoTime();
        fibonacciRecursive(N);
        System.out.println("Recursive time (ms): "
                + (System.nanoTime() - start) / 1_000_000);

        start = System.nanoTime();
        fibonacciIterative(N);
        System.out.println("Iterative time (ms): "
                + (System.nanoTime() - start) / 1_000_000);
    }
}

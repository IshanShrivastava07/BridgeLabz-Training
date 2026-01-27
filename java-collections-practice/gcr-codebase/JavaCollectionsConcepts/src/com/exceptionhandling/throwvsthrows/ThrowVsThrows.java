package com.exceptionhandling.throwvsthrows;

public class ThrowVsThrows {

    // Method that validates and propagates exception
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            // throw is used to manually throw an exception
            throw new IllegalArgumentException("Invalid input");
        }

        // Simple Interest formula
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {
            double interest = calculateInterest(5000, 5, 2);
            System.out.println("Calculated Interest = " + interest);

            // Try invalid input
            // double interest = calculateInterest(-5000, 5, 2);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}

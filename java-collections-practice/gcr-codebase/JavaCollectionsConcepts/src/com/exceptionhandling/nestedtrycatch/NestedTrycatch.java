package com.exceptionhandling.nestedtrycatch;

import java.util.Scanner;

public class NestedTrycatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            // Outer try for array access
            try {
                int value = arr[index];
                System.out.println("Value at index " + index + " = " + value);

                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                // Inner try for division
                try {
                    int result = value / divisor;
                    System.out.println("Result after division = " + result);

                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index");
            }

        } finally {
            sc.close();
        }
    }
}

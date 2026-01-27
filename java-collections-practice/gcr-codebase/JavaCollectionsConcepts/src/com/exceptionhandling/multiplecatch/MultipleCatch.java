package com.exceptionhandling.multiplecatch;

public class MultipleCatch {

    public static void main(String[] args) {

        // You can change this to null to test NullPointerException
        int[] arr = {10, 20, 30, 40, 50};

        int index = 3;   // try changing to 10 for out of bounds

        try {
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}

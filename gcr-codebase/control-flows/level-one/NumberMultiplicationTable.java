//Create class NumberMultiplicationTable that prints the multiplication table of a given number from 6 to 9.

import java.util.Scanner;
public class NumberMultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop to print table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner stream
        sc.close();
    }
}
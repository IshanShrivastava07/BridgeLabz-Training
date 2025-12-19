// Create a class ArmstrongNumber that checks if a number is an Armstrong Number or not.

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner sc = new Scanner(System.in);

        // taking input number
        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();

        // Declaring Variables for calculation
        int number = originalNumber;
        int sum = 0;
        int digit;

        // Looping to process each digit
        while (number != 0) {
            // Get the last digit
            digit = number % 10;
            
            // Add cube of the digit to sum
            sum += (digit * digit * digit);
            
            // Removing the last digit
            number = number / 10;
        }

        // checking if sum matches original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number.");
        }

        // Close the scanner
        sc.close();
    }
}
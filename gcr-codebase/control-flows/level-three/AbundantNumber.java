// Create a class AbundantNumber that checks if a number is an Abundant Number or not.

import java.util.Scanner;
//creating class Abundant Number
public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Taking input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Declaring SumOfDivisors = 0
        int sumOfDivisors = 0;

        // Looping from 1 to number - 1 to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Checking if the sum > number
        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

       //close scanner
        sc.close();
    }
}

import java.util.Scanner;
// Create a Java program to check if a number is a Harshad Number or not.
public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input number
        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();

        // Taking Variables for calculation
        int number = originalNumber;
        int sumOfDigits = 0;
        int digit;

        // Calculating sum of digits
        while (number != 0) {
            digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        // Checking divisibility
        if (sumOfDigits != 0 && originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        // Close the scanner stream
        sc.close();
    }
}
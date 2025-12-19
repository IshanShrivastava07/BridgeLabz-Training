//Create class BasicCalculator that takes two numbers as input and prints the addition, subtraction, multiplication, and division value of those two numbers.

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking first number as input
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        // Taking second number as input
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // Performing arithmetic operations
        double additionResult = number1 + number2;
        double subtractionResult = number1 - number2;
        double multiplicationResult = number1 * number2;
        double divisionResult = number1 / number2;

        // Displaying the results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + additionResult + ", " + subtractionResult + ", " + multiplicationResult + ", and " + divisionResult);
        
        // Close the scanner
        sc.close();
    }
}
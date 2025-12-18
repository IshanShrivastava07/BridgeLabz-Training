import java.util.Scanner;

// Creating class Calculator to perform basic arithmetic operations
class BasicCalculator {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking two numbers from user
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Printing the result
        System.out.println(
            "The addition, subtraction, multiplication, and division value of 2 numbers " +
            number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " +
            multiplication + ", and " + division
        );
    }
}

import java.util.Scanner;

public class PowerCalculatorWhileLoop {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        // Looping until counter equals power
        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println(number + " to the power of " + power + " is " + result);

        // Close the scanner
        sc.close();
    }
}
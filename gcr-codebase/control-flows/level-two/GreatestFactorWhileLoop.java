import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        // Looping backward using while
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Exit loop
            }
            counter--;
        }

        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        // Close the scanner
        sc.close();
    }
}
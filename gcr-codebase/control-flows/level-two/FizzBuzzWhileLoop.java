import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive integer
        if (number > 0) {
            int i = 1;
            //Using While loop from 1 to number
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // Increment counter
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner
        sc.close();
    }
}
import java.util.Scanner;

public class FactorsForLoop {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop from 1 to number - 1 (as per hint "i < number")
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i + " is a factor of " + number);
            }
        }
        // Close the scanner
        sc.close();
    }
}
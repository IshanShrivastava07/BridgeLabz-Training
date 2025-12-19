import java.util.Scanner;

public class MultiplesForLoop {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // for Looping backwards from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of number
            if (i % number == 0) {
                System.out.println(i + " is a multiple of " + number);
            }
        }

        // Close the scanner
        sc.close();
    }
}
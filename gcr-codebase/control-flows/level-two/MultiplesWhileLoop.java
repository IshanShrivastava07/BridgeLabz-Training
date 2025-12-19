import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int counter = 100;

        // Looping while counter >= 1
        while (counter >= 1) {
            // Checking if the counter is a multiple of number
            if (counter % number == 0) {
                System.out.println(counter + " is a multiple of " + number);
            }
            counter--;
        }

        // Close the scanner
        sc.close();
    }
}
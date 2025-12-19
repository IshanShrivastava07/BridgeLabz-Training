import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int i = 1;
        // Using while Loop while i < number
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i + " is a factor of " + number);
            }
            i++;
        }

        // Close the scanner
        sc.close();
    }
}
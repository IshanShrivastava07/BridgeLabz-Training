import java.util.Scanner;
//creating class SumUntilNegative to find sum until number is negative
public class SumUntilNegative {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double userValue = sc.nextDouble();

            // Check condition to break
            if (userValue <= 0) {
                break;
            }

            // Add to total
            total += userValue;
        }

        // Display total
        System.out.println("The total sum is: " + total);

        // Close the scanner
        sc.close();
    }
}
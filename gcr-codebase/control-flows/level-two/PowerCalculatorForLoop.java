import java.util.Scanner;

public class PowerCalculatorForLoop {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // taking inputs
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;

        // Looping to calculate power
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println(number + " to the power of " + power + " is " + result);

        // Close the scanner
        sc.close();
    }
}
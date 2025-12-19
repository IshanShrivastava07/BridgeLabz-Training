import java.util.Scanner;
//creating class RocketLaunchWhileLoop
public class RocketLaunchWhileLoop {
    public static void main(String[] args) {

        // Creating a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get start value for countdown
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        System.out.println("Rocket Launch Countdown:");
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement counter
        }

        // Close the scanner
        sc.close();
    }
}
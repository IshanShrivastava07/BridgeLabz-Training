import java.util.Scanner;

// creating class RocketLaunchForLoop 
public class RocketLaunchForLoop {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get start value for countdown
        System.out.print("Enter countdown start value: ");
        int startValue = sc.nextInt();

        // Countdown using for loop
        System.out.println("Rocket Launch Countdown:");
        for (int i = startValue; i >= 1; i--) {
            System.out.println(i);
        }

        // Close the scanner
        sc.close();
    }
}
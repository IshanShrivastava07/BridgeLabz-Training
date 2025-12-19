import java.util.Scanner;
//creating class OddOrEven to identify odd or even number
public class OddOrEven {

    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number > 0) {
            // Iterate from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("Please enter a natural number.");
        }
        
        sc.close();
    }
}
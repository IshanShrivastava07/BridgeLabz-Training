import java.util.Scanner;

// Creating class NaturalNumberSum to check natural number and find sum
class NaturalNumberSum {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking number from user
        int number = input.nextInt();

        // Checking if the number is a natural number
        if (number >= 0) {

            // Calculating sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Displaying the result
            System.out.println(
                "The sum of " + number +
                " natural numbers is " + sum
            );
        } else {

            // Displaying message if not a natural number
            System.out.println("The number " + number +" is not a natural number");
                
        }
    }
}

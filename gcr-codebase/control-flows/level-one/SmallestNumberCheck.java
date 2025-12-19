import java.util.Scanner;

// Creating class SmallestNumberCheck to check if the first number is the smallest
class SmallestNumberCheck {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking three numbers from user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Checking if first number is the smallest
        boolean isSmallest = number1 < number2 && number1 < number3;

        // Displaying the result
        System.out.println( "Is the first number the smallest? " + isSmallest );          
    }
}

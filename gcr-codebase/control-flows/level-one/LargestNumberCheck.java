import java.util.Scanner;

// Creating class LargestNumberCheck to check which number is the largest
class LargestNumberCheck {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking three numbers from user
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        // Checking which number is the largest
        boolean isFirstLargest = number1 > number2 && number1 > number3;
        boolean isSecondLargest = number2 > number1 && number2 > number3;
        boolean isThirdLargest = number3 > number1 && number3 > number2;

        // Displaying the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}

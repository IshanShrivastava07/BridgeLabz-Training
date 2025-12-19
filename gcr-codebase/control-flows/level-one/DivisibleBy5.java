import java.util.Scanner;

// Creating class DivisibleBy5 to check divisibility by 5
class DivisibleBy5 {
    public static void main(String[] args) {

        //Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking number from user
        int number = sc.nextInt();

        // Checking divisibility by 5
        boolean isDivisible = number % 5 == 0;

        // Displaying the result
        System.out.println( "Is the number " + number +" divisible by 5? " + isDivisible
        );
		sc.close();
    }
}
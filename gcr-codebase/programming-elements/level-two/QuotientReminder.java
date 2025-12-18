import java.util.Scanner;

// Creating class QuotientReminder to find quotient and reminder of two numbers
class QuotientReminder {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking two numbers from user
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        // Calculating quotient and reminder
        int quotient = number1 / number2;
        int reminder = number1 % number2;

        // Displaying the result
        System.out.println(
            "The Quotient is " + quotient +" and Reminder is " + reminder +" of two number " + number1 +
            " and " + number2  );   
    }
}

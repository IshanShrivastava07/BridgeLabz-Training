import java.util.Scanner;

// Creating class QuotientAndRemainder calculates the quotient and remainder of two numbers.

public class QuotientAndRemainder {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Calling method
        int[] result = findRemainderAndQuotient(num, divisor);

        // Displaying result
        System.out.println("Quotient is " + result[0]);
        System.out.println("Remainder is " + result[1]);

        sc.close();
    }
}

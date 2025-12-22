import java.util.Scanner;

// create a class NumberCheckerFour class to check special numbers
public class NumberCheckerFour {

    // Method to check Prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check Spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check Automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        return true;
    }

    // Method to check Buzz number
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    // psvm
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Prime Number = " + isPrime(number));
        System.out.println("Is Neon Number = " + isNeonNumber(number));
        System.out.println("Is Spy Number = " + isSpyNumber(number));
        System.out.println("Is Automorphic Number = " + isAutomorphicNumber(number));
        System.out.println("Is Buzz Number = " + isBuzzNumber(number));

        sc.close();
    }
}

import java.util.Scanner;

// Creating class RecursiveSum to find sum of n natural numbers recursively
class RecursiveSum {

    // Recursive method to find sum of n natural numbers
    public static int sumRecursion(int n) {
        if (n ==0)
            return 0;
        return n + sumRecursion(n - 1);
    }

    // Creating Method to find sum using formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n *(n + 1) / 2;
    }

    public static void main(String[] args) {
		
		//Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Checking for natural number
        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        int recursiveSum = sumRecursion(n);
        int formulaSum = sumFormula(n);

    // Displaying results
    System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Comparing both the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are equal");
        } else {
            System.out.println("Results are not equal");
        }
    }
}
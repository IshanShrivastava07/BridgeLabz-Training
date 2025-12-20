import java.util.Scanner;

// Creating class SumOfNaturalNumbers finds the sum of n natural numbers using a loop.
 
public class SumOfNaturalNumbers {

    // Method to calculate sum using loop
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
	    
		//Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Calling method
        int result = findSum(n);

        // Displaying result
        System.out.println("The sum of " + n + " natural numbers is " + result);

        // Closing Scanner stream
        sc.close();
    }
}

import java.util.Scanner;

// creating class NumberSignCheck to checks whether a number is positive, negative, or zero.
public class NumberSignCheck {

    // Method to check number sign
    public static int checkSign(int number) {
        if (number > 0)
            return 1;     // positive number
        else if (number < 0)
            return -1;    // negative number
        else
            return 0;     // zero
    }

    public static void main(String[] args) {
		
		// Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calling method
        int result = checkSign(number);

        // Displaying result
        if (result == 1)
            System.out.println("The number " + number + " is Positive.");
        else if (result == -1)
            System.out.println("The number " + number + " is Negative.");
        else
            System.out.println("The number is Zero.");
      
	  // closing Scanner stream 
        sc.close();
    }
}

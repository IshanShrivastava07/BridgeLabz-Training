
import java.util.Scanner;
// Creating  class DigitCount that takes a number as input and counts the number of digits in that number.
public class DigitCount {
    public static void main(String[] args) {
        // Creating a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Taking input number
        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();
        
        // Handling negative numbers by using absolute value for counting
        int number = Math.abs(originalNumber);
        
        // Variable to store count
        int count = 0;

        // Handling case for 0 explicitly if needed, otherwise loop works for n > 0
        if (number == 0) {
            count = 1;
        } else {
            // Looping until number becomes 0
            while (number != 0) {
                // Remove last digit
                number = number / 10;
                // Increment count
                count++;
            }
        }
        // Displaying result
        System.out.println("The number " + originalNumber + " has " + count + " digits.");

        // Close the scanner
        sc.close();
    }
}
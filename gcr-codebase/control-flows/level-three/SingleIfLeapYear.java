import java.util.Scanner;
 //Create class SingleIfLeapYear that checks if a year is a Leap Year or not using a single if statement.
public class SingleIfLeapYear {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking the year input from the user
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Checking validity first
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } else {
            // (Divisible by 4 AND NOT divisible by 100) OR (Divisible by 400)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Close the scanner stream
        sc.close();
    }
}
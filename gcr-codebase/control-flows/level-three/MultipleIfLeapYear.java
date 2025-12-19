
import java.util.Scanner;
//Create class MultipleIfLeapYear that checks if a year is a Leap Year or not using multiple if statements.
public class MultipleIfLeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Taking the year input from the user
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Checking if the year is valid for the Gregorian calendar (>= 1582)
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582 (Gregorian Calendar).");
        } else {
            // checking for Leap Year using multiple if-else statements
            // A year is a leap year if divisible by 4
            if (year % 4 == 0) {
                //but not by 100
                if (year % 100 == 0) {
                    //unless it is also divisible by 400.
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    // Divisible by 4 but not by 100 is a Leap Year
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                // Not divisible by 4 is not a Leap Year
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Close the scanner 
        sc.close();
    }
}
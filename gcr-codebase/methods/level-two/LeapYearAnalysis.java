import java.util.Scanner;

// Creating class LeapYearAnalysis to analyse if a year is leap year or not
class LeapYearAnalysis {

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year<1582) {
            return false;
        }
        return (year % 4==0 && year % 100!=0) || (year % 400==0);
    }

    public static void main(String[] args) {
		
		//Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Checking leap year condition
        if (isLeapYear(year)) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }
    }
}

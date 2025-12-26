// Creating class DateComparison Compare two dates
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask user for first date
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate d1 = LocalDate.parse(sc.next());

        // Ask user for second date
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate d2 = LocalDate.parse(sc.next());

        // Check if first date is before second date
        if (d1.isBefore(d2))
            System.out.println("First date is before second date");

        // Check if first date is after second date
        else if (d1.isAfter(d2))
            System.out.println("First date is after second date");

        // Check if both dates are equal
        else
            System.out.println("Both dates are same");
    }
}

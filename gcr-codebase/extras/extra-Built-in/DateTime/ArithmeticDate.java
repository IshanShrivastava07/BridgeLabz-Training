//  creating class ArithmeticDate Perform date arithmetic operations
import java.time.LocalDate;
import java.util.*;

public class ArithmeticDate {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Asking user to enter date
        System.out.print("Enter date (yyyy-MM-dd): ");

        // Reading date from user
        LocalDate date = LocalDate.parse(sc.next());

        // Add days, months, years and subtract weeks
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        // Display final calculated date
        System.out.println("Final Date: " + result);
    }
}

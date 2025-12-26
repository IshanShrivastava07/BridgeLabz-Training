// creating class DateFormatting to display current date in different formats
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        // Get current date
        LocalDate today = LocalDate.now();

        // Display date in dd/MM/yyyy format
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Display date in yyyy-MM-dd format
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // Display date in EEE, MMM dd, yyyy format
        System.out.println(today.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }
}

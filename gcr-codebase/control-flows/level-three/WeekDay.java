import java.util.Scanner;
//creating class WeekDay 
public class WeekDay {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input for month, day and year
        System.out.print("Enter month (1 for Jan, 2 for Feb, ...): ");
        int m = sc.nextInt();

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        // Applying Gregorian calendar formulas
        // y0 = y - (14 - m) / 12
        int y0 = y - (14 - m) / 12;
        
        // x = y0 + y0/4 - y0/100 + y0/400
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        
        // m0 = m + 12 * ((14 - m) / 12) - 2
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        
        // d0 = (d + x + 31 * m0 / 12) % 7
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result (0 for Sunday, 1 for Monday, etc.)
        System.out.println("The day of the week is: " + d0);
        
        // Close the scanner 
        sc.close();
    }
}
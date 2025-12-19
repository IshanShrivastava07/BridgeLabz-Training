import java.util.Scanner;
//creating class SpringSeason
public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get month and day
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Spring is from March 20 to June 20
        // Logic: (Month is March AND day >= 20) OR (Month is June AND day <= 20) OR (Month is April or May)
        boolean isSpring = (month == 3 && day >= 20) || 
                           (month == 6 && day <= 20) || 
                           (month == 4 || month == 5);

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        // Close the scanner
        sc.close();
    }
}
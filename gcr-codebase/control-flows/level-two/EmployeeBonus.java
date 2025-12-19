import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Take salary as input
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        double yearsOfService = sc.nextDouble();

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus is awarded. Years of service must be more than 5.");
        }

        // Close the scanner
        sc.close();
    }
}
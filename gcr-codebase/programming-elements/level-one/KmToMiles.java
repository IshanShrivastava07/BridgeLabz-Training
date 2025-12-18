import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {

        // Declare variable
        double km, miles;
        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);
        // Take input in kilometers
        km = input.nextDouble();
        // Convert km to miles
        miles = km / 1.6;

        // Display Distance in miles and kms
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}







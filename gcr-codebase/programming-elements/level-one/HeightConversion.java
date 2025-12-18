import java.util.Scanner;
//creating class for converting height in cm to feet and inches
public class HeightConversion {
    public static void main(String[] args) {

        // Declaring  variables
        double cm;
        int feet;
        double inches;

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input in centimeters
        cm = sc.nextDouble();
        // Converting cm to total inches
        inches = cm / 2.54;
        // Converting inches to feet and remaining inches
        feet = (int) (inches / 12);
        inches = inches % 12;
		
        // Display output
        System.out.println(
            "Your Height in cm is " + cm +  " while in feet is " + feet + " and inches is " + inches );  
    }
}
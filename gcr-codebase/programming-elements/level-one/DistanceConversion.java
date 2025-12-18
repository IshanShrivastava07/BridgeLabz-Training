import java.util.Scanner;

// Creating a class to convert distance from feet to yards and miles
class DistanceConversion {
    public static void main(String[] args) {

        // Creating scanner to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking distance in feet from user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        // Converting feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;
        // Converting yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Displaying the result
        System.out.println(
            "The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles + " for the given distance of " + distanceInFeet + " feet"
        );
    }
}

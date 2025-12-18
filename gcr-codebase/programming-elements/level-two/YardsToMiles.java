import java.util.Scanner;

// Creating class YardsToMiles to convert distance from feet to yards and miles
class YardsToMiles {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking distance in feet from user
        double distanceInFeet = input.nextDouble();

        // Converting feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Converting yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Displaying the result
        System.out.println(
            "The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles
        );
    }
}

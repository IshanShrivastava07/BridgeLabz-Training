// Creating class UnitConvertorTwo with static conversion methods
public class UnitConvertorTwo {

    // Converting yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsTofeet = 3;
        return yards * yardsTofeet;
    }

    // Converting feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToyards = 0.333333;
        return feet * feetToyards;
    }

    // Converting meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToinches = 39.3701;
        return meters * metersToinches;
    }

    // Converting inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesTometers = 0.0254;
        return inches * inchesTometers;
    }

    // Converting inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesTocm = 2.54;
        return inches * inchesTocm;
    }

    // Main method to test conversions
    public static void main(String[] args) {
        System.out.println("5 yards in feet = " + convertYardsToFeet(5));
        System.out.println("15 feet in yards = " + convertFeetToYards(15));
        System.out.println("2 meters in inches = " + convertMetersToInches(2));
        System.out.println("20 inches in meters = " + convertInchesToMeters(20));
        System.out.println("10 inches in centimeters = " + convertInchesToCentimeters(10));
    }
}

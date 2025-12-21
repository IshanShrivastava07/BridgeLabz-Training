import java.util.*;

// Creating class TrigonometricFunctions calculate trigonometric functions for a given angle
public class TrigonometricFunctions {

    // Method to calculate sine, cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
		
		// Creating Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the angle in degrees:");
        double angle = sc.nextDouble();

        // Calling method
        double[] result = calculateTrigonometricFunctions(angle);

        // Displaying results
        System.out.println("Sine of angle = " + result[0]);
        System.out.println("Cosine of angle = " + result[1]);
        System.out.println("Tangent of angle = " + result[2]);
		
		sc.close();
    }
}

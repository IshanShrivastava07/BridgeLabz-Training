import java.util.*;

// Creating class WindChillTemperature to calculate Wind Chill Temperature
public class WindChillTemperature {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) 
          + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);      
    }

    public static void main(String[] args) {
		
		// Create Scanner object 
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the temperature:");
        double temperature = sc.nextDouble();

        System.out.println("Enter the wind speed:");
        double windSpeed = sc.nextDouble();

        // Calculating wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Displaying result
        System.out.println("The Wind Chill Temperature is " + windChill);
    }
}

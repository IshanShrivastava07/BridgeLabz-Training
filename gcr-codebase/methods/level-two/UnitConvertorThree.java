// Creating class UnitConvertorThre with static conversion methods
public class UnitConvertorThree {

    // Converting Fahrenhite to Celsius
    public static double convertFahrenheitToCelsius(double farhenheit) {
        double fahrenheitToCelsius = (farhenheit - 32) * 5 / 9;
        return fahrenheitToCelsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius){
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;
        return celsiusToFahrenheit;
    }

    // Converting pounds to kilograms
    public static double convertPoundsToKilograms(double pounds){
        double poundsToKilograms = 0.453592;
        return pounds * poundsToKilograms;
    }
    // Converting kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms)
	{
        double kilogramsToPounds = 2.20462;
        return kilograms * kilogramsToPounds;
    }

    // Converting gallons to liters
    public static double convertGallonsToLiters(double gallons) 
	{
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }
    // Converting liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172;
        return liters * litersToGallons;
    }
    // Creating main method
    public static void main(String[] args) {
        System.out.println("98.6 Fahrenheit in Celsius = " + convertFahrenheitToCelsius(98.6));
        System.out.println("37 Celsius in Fahrenheit = " + convertCelsiusToFahrenheit(37));
        System.out.println("150 pounds in kilograms = " + convertPoundsToKilograms(150));
        System.out.println("68 kilograms in pounds = " + convertKilogramsToPounds(68));
        System.out.println("5 gallons in liters = " + convertGallonsToLiters(5));
        System.out.println("10 liters in gallons = " + convertLitersToGallons(10));
    }
}

//creating class VolumeOfEarth to find volume of earth in cubic kilometers
public class VolumeOfEarth{
	public static void main(String args[]){
		
		 // Radius of Earth in kilometers
        double radiusKm = 6378;
        // Value of Pi
        double pi = 3.141592653589793;
        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;
        // Conversion factor: 1 km = 0.621371 miles
        double kmToMiles = 0.621371;

        // Volume in cubic miles
        double volumeMiles3 = volumeKm3 * kmToMiles * kmToMiles * kmToMiles;
        // Single print statement for multiline output
        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm3 +" and cubic miles is " + volumeMiles3 );
    }
}
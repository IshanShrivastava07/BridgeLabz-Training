import java.util.*;

//Creating class TriangularRun to calculates how many rounds an athlete must run in a triangular park to complete a 5 km run.
class TriangularRun{
	
	// Method to calculate number of rounds
	public static double calculateRounds(double side1, double side2, double side3)
	{
		// Perimeter of the triangular park
		double perimeter = side1 + side2 + side3;
		
		// Total distance to be covered (5 km = 5000 meters)
		double totalDistance = 5000;
       
	    // Number of rounds required
       return totalDistance / perimeter;
	}

  public static void main(String[] args){
	  
	  //Creating Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Taking input from user
	  System.out.print("Enter length of side 1 (in meters): ");
	  double side1 = sc.nextInt();
	  
	  System.out.print("Enter length of side 2 (in meters): ");
	  double side2 = sc.nextInt();
	  
	  System.out.print("Enter length of side 3 (in meters): ");
	  double side3 = sc.nextInt();
	  
	  // Calling method to calculate rounds
	  double rounds = calculateRounds(side1, side2, side3);
	  
	  //Displaying number of rounds
	  System.out.println("The athlete must complete " + rounds + " rounds to finish a 5 km run.");

     sc.close();
  }
}
	  
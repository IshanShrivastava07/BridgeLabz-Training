import java.util.*;
// Creating class Handshakes to calculate the maximum number of handshakes among students
class Handshakes{
	// Method to calculate maximum handshakes using combination formula
	public static int countHandshakes( int n)
	{
		// formula for handshakes
		return (n*(n - 1) / 2);
	}
	
	public static void main(String[] args) 
	{
		// creating scanner object
		Scanner sc = new Scanner (System.in);
		
		 // Taking input from user
		 System.out.print("Enter the number of students: ");
		int numberOfStudents = sc.nextInt();
		
		// Calculating handshakes
		int handshakes =   countHandshakes(numberOfStudents);
		
		// Displaying output
		 System.out.print("The maximum number of possible handshakes is "  + handshakes);
	}
}
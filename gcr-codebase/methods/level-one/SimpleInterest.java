import java.util.*;

// Creating class SimpleInterest to calculate SimpleInterest
public class SimpleInterest {
	//creating method SimpleInterestCalculator to calculate simple interest
	public static double SimpleInterestCalculator(double principle, double rate, double time)
	{   // applying simple interest formula
		return (principle*rate*time) / 100;
	}
	
	public static void main(String args[]) 
	{
		//Creating Scanner object
		Scanner sc = new Scanner (System.in); 
		// taking principal as input
		System.out.println("Enter the Principal amount:");
		double principal = sc.nextDouble();
		// taking rate as input
		System.out.println("Enter the Rate of Interest:");
		double rate = sc.nextDouble();
		//taking time as input
		System.out.println("Enter the Time period:");
		double time  = sc.nextDouble();
		// calling the method to calculate simple interest
		double simpleInterest = SimpleInterestCalculator(principal, rate, time);
		// printing simple interest as result
		System.out.println(
		 "The Simple Interest is : " + simpleInterest + " for Principal " + principal +
		 " Rate of Interest " + rate + " and Time " + time);
	}
}

	
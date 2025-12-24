import java.util.*;

public class ReverseString {
	
	public static void main(String args[]){
		
		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter String");
		String s = sc.next();
		
		 //Using StringBuilder for efficient string reversal
		StringBuilder rev = new StringBuilder();
		
		//Looping from end through the original string
		for(int i = s.length() - 1; i >= 0; i--) {
			rev.append(s.charAt(i));
		}
		//Displaying result
		System.out.print("Reversed String: "+ rev.toString());
	}
}
import java.util.Scanner;

public class Palindrome{
	
public static void main(String[] args) {
	
	//creating Scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking user input
	System.out.println("Enter String: ");
	String s = sc.next();
		
		 //Using StringBuilder for efficient string reversal
		StringBuilder rev = new StringBuilder();
		
		//Looping from end through the original string
		for(int i = s.length() - 1; i >= 0; i--) {
			rev.append(s.charAt(i));
		}
		
		//Boolean method to check if string is palindrome or not
		boolean isPalindrome = s.equals(rev.toString());
		
		// Displaying result
		System.out.println("Is Palindrome : " + isPalindrome);
}
}


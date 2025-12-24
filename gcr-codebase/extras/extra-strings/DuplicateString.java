import java.util.*;

public class DuplicateString{
	
	public static void main(String args[]){
		
 //Creating scanner object
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String: ");
	String s = sc.next();
	
	// StringBuilder to store result without duplicates
	StringBuilder sbr = new StringBuilder();
	
	//loo thorugh each character of the string
	for(int i = 0; i < s.length(); i++){
		
		char ch = s.charAt(i);
		
		// Append character only if it is not already present
		if(sbr.indexOf(String.valueOf(ch)) == -1){
			sbr.append(ch);
		}
	}
	System.out.println("String after removing duplicates: " + sbr.toString());
}
}	
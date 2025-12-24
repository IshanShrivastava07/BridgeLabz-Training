import java.util.*;

public class SubstringCount{
	
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking main string  input
		System.out.println("Enter the main string: ");
		String s = sc.nextLine();
		
		//taking sub string as input
		System.out.println("Enter the sub string to search");
		String sub = sc.next();
		
		int count = 0;
		int index = 0;
		
		 // Loop to find all occurrences of substring
		while(( index = s.indexOf(sub, index)) != -1){
			count++;
			index = index + sub.length();
		}
		
		//displaying output
		System.out.println("Substring appeared: " + count+ " times");
	}
}
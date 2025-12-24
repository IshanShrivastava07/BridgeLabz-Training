import java.util.*;

class CountVowelsNConsonants{
	
	public static void main(String[] args) {
		
		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Taking Input
		System.out.println("Enter string : ");
		String s = sc.next();
		
		// Converting the string to lowercase to avoid checking both cases
        s = s.toLowerCase();
		
		int n = s.length();
		int vowelCount = 0;
		 int consonantCount = 0;
		 
		// Loop through each character of the string
		 for(int i = 0; i < n; i++) {
			 
			 char ch = s.charAt(i);
			 
			  // Check if the character is an alphabet
			 if(ch >= 'a' && ch <= 'z') {
				 
				  // Check for vowels 
				 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					 vowelCount++;
				 }
				// Remaining alphabets are consonants
				 else{
					 consonantCount++;
				 }
			 } 
		 }
		 //Display Result
			 System.out.println("Number of Vowels: " + vowelCount);
			  System.out.println("Number of Consonants: " + consonantCount);
	}
}
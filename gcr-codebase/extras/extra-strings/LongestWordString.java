import java.util.*;

public class LongestWordString{
	
	public static void main(String[] args) {
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//takei input
		System.out.println("Enter string :");
		String s = sc.nextLine();
		
		String currentWord = "";
		String longestWord = "";
		
		// Loop through each character of the sentence
		for(int i = 0; i < s.length(); i++) {
         
     char ch = s.charAt(i);
 // If character is not space, build the current word
   if(ch != ' '){
currentWord += ch;
   }
// If space encountered, compare word lengths
   else {
 if(currentWord.length() > longestWord.length()){
 longestWord = currentWord;
 }
currentWord = "";
}
}
// Final check for the last word
if(currentWord.length() > longestWord.length()){
longestWord = currentWord;
}

 // Display result
        System.out.println("Longest word: " + longestWord);
    }
}	
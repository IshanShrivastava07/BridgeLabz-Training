import java.util.*;

public class ToggleCase{
	
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking string input
		String s = sc.next();
		
		//ceating Stringbuilder to store toggled results
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++){
			
			char ch = s.charAt(i);
			
			// If character is uppercase, convert to lowercase
			if(ch >= 'a' && ch <= 'z'){
				sb.append((char) (ch-32));
			}
			
			// If character is lowercase, convert to uppercase
			else if(ch >= 'A' && ch <= 'Z'){
				sb.append((char) (ch+32));
			}
			else{
				sb.append(ch);
		}
		}
		//Display result
		System.out.println(sb);
	}
}
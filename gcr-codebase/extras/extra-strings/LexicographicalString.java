import java.util.*;

public class LexicographicalString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 // Taking user input
        System.out.println("Enter first string");
        String s1 = sc.nextLine();

        System.out.println("Enter second string");
        String s2 = sc.nextLine();

        int minLength = s1.length() < s2.length() ? s1.length() : s2.length();
        int result = 0;

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                if (c1 < c2)
                    result = -1;
                else
                    result = 1;
                break;
            }
        }

        // If all characters matched till min length
        if (result == 0) {
            if (s1.length() < s2.length())
                result = -1;
            else if (s1.length() > s2.length())
                result = 1;
        }

        // Display result
        if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
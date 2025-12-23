import java.util.Scanner;

class StringSubstring {

// Creating main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String charAtSubstring = createSubstringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);

        boolean isSame = compareStringsUsingCharAt(charAtSubstring, builtInSubstring);
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Both substrings are equal: " + isSame);
    }

    // Create substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++)
			{
            result += str.charAt(i);
        }
        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
         }
      }
        return true;
   }
}

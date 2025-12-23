import java.util.Scanner;

class LowerCaseComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the text: ");
          String text = sc.nextLine();

        // User-defined lowercase conversion
        String customLower = toLowerCaseUsingCharAt(text);

        // Built-in lowercase conversion
         String builtInLower = text.toLowerCase();

        // Compare both results
        boolean isSame = compareStrings(customLower, builtInLower);

        System.out.println("Lowercase using charAt(): " + customLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Both results are equal: " + isSame);
    }

    // Convert uppercase to lowercase using charAt() and ASCII logic
    public static String toLowerCaseUsingCharAt(String str) {
        String result = "";
        for (int i =0; i <str.length(); i++) {
          char ch = str.charAt(i);
            if (ch >= 'A'&& ch <='Z') {
            ch = (char) (ch + 32); // ASCII difference
          }
         result += ch;
        }
        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length()!=s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
              return false;
            }
        }
        return true;
    }
}

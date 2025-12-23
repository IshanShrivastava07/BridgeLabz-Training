import java.util.Scanner;

class UpperCaseComparison {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the text: ");
       String text = sc.nextLine();

        // User-defined uppercase conversion
        String customUpper = toUpperCaseUsingCharAt(text);
        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Compare both results
        boolean isSame = compareStrings(customUpper, builtInUpper);

        System.out.println("Uppercase using charAt(): " + customUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Both results are equal: " + isSame);
    }

    // Convert lowercase to uppercase using charAt() and ASCII logic
    public static String toUpperCaseUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
          if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // ASCII difference
          }
            result += ch;
        }
        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
              return false;
            }
      }
        return true;
     }
 }

import java.util.Scanner;

class TrimCharAt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Get start and end indexes after trimming
        int[] indexes = trimIndexes(text);

        // Create substring using charAt()
        String customTrim = createSubstring(text, indexes[0], indexes[1]);

        // Built in trim
      String builtInTrim = text.trim();

        // Compare results
        boolean isSame = compareStrings(customTrim, builtInTrim);

      System.out.println("Trimmed using charAt(): [" + customTrim + "]");
      System.out.println("Trimmed using trim():   [" + builtInTrim + "]");
      System.out.println("Both results are equal: " + isSame);
    }

    // Find start and end index without spaces
    public static int[] trimIndexes(String str) {

        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; }

    // Create substring using charAt()
    public static String createSubstring(String str, int start, int end) {

        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;}
		
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

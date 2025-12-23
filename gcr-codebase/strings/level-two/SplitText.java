import java.util.Scanner;

class SplitText {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // User-defined split
        String[] customWords = splitCharAt(text);
		
		
      // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare results
        boolean isSame = compareStringArrays(customWords, builtInWords);

        System.out.println("Words using charAt():");
        printArray(customWords);

        System.out.println("Words using split():");
        printArray(builtInWords);

       System.out.println("Both results are equal: " + isSame);
  }

    // Find length without using length()
    public static int findLength(String str) {
       int count = 0;
        try {
            while (true) {
                str.charAt(count);
              count++;
            }
        } catch (Exception e) {
        }
      return count;
    }

    // Split text into words using charAt()
    public static String[] splitCharAt(String str) {

      int len = findLength(str);
      int wordCount = 1;

        for (int i = 0; i < len; i++) {
          if (str.charAt(i) == ' ') {
              wordCount++;
           }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
              word += str.charAt(i);
            } else {
              words[index++] = word;
                word = "";
         }
        }
        words[index] = word;

        return words;
    }

    // Compare two String arrays
    public static boolean compareStringArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

       for (int i = 0; i < a.length; i++)
		   {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    // Print array
    public static void printArray(String[] arr) {
        for (String s : arr) {
          System.out.println(s);
     }
    }
}

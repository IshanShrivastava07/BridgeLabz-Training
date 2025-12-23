import java.util.Scanner;

class WordLength {

    public static void main(String[] args) {

      	  Scanner sc = new Scanner(System.in);
       
	   System.out.print("Enter the text: ");
       String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] result = createWordLengthArray(words);

        System.out.println("\nWord\tLength");
        System.out.println("--------------");

        for (int i = 0; i < result.length; i++) {
            String word = result[i][0];
            int length = Integer.parseInt(result[i][1]); // String → int
            System.out.println(word + "\t" + length);
        }
    }

    // Split text into words using charAt()
    public static String[] splitUsingCharAt(String str) {

        int len = findLength(str);
        int wordCount = 1;

        for (int i=0; i<len; i++) {
            if (str.charAt(i)==' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index=0;
        String word = "";

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
               word += str.charAt(i);
          } else {
                words[index++] = word;
                word = "";
            }
      }
        words[index]=word;

        return words;
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

    // Create 2D array of word and its length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
          result[i][0] = words[i];
        result[i][1] = String.valueOf(findLength(words[i]));
     }
        return result;
  }
}

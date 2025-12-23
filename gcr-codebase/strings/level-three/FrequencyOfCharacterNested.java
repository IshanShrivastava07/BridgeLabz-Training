import java.util.Scanner;
public class FrequencyOfCharacterNested {

    // Method to find character frequency
    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        //  Nested loops to find frequency
        for (int i = 0; i < chars.length; i++) {

            // Skip already counted characters
            if (chars[i] == '0') {
                continue;
            }

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
             if (chars[i] == chars[j]) {
                 freq[i]++;
                 chars[j] = '0'; // Mark duplicate
     	}
        }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
          if (chars[i] != '0') {
                count++;
          }
        }

        // Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i=0; i<chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = "Character '" + chars[i] + "' : " + freq[i];
                index++;
       }
      }
        return result;
    }

    // Main method
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
      //input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

      // Calling method to find char frequency 
        String[] frequency = findCharacterFrequency(text);

      // Displaying of output
        System.out.println("\nCharacter Frequency:");
       for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i]);
    }
 }
}
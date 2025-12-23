import java.util.*;

public class FrequencyOfCharactersTwo {

    // Method to find unique characters
    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check if character already exists
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                  isUnique = false;
                  break;
              }
            }
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        // Create exact size array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }
    // Method to find frequency of characters
    public static String[][] findCharacterFrequency(String text) {

        // Step 1: Frequency array using ASCII (256)
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        //  Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        //  Store character and frequency in 2D array
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }
    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Calling method
        String[][] frequency = findCharacterFrequency(text);

        // Display result
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Character '" + frequency[i][0] + "' : " + frequency[i][1]);
        }
    }
}
import java.util.Scanner;

public class FrequencyOfCharacters {

    // Method to find character frequencies using charAt()
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;}
      
	  // Count unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                count++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark counted
            }
        }
        String[][] result = new String[count][2];
        int index = 0;
        // Store characters and their frequencies
        for (int i = 0; i < text.length(); i++) {
            int ascii = text.charAt(i);
            if (freq[ascii] < 0) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(-freq[ascii]);
                freq[ascii] = 0;
                index++; } }
        return result;
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character\tFrequency");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}


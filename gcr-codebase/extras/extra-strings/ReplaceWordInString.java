import java.util.Scanner;


public class ReplaceWordInString {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking sentence input
        System.out.println("Enter sentence");
        String sentence = sc.nextLine();
         
		 int n = sentence.length();
		 
        // Taking word to be replaced
        System.out.println("Enter word to replace");
        String oldWord = sc.next();

        // Taking new word
        System.out.println("Enter new word");
        String newWord = sc.next();

        String result = "";
        String currentWord = "";

        // Loop through sentence character by character
        for (int i = 0; i < n; i++) {

            char ch = sentence.charAt(i);

            // Build word until space is found
            if (ch != ' ') {
                currentWord += ch;
            } else {
                // Compare and replace word
                if (currentWord.equals(oldWord)) {
                    result += newWord;
                } else {
                    result += currentWord;
                }
                result += " ";
                currentWord = "";
            }
        }

        // Handle last word
        if (currentWord.equals(oldWord)) {
            result += newWord;
        } else {
            result += currentWord;
        }

        // Display result
        System.out.println("Modified Sentence:");
        System.out.println(result);
    }
}

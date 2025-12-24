import java.util.Scanner;

// Program to remove all occurrences of a specific character from a string
public class RemoveSpecificCharacter {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.println("Enter String");
        String s = sc.nextLine();

        // Taking character to remove
        System.out.println("Enter character to remove");
        char removeChar = sc.next().charAt(0);

        // StringBuilder to store modified string
        StringBuilder sb = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Append character only if it is not the character to remove
            if (ch != removeChar) {
                sb.append(ch);
            }
        }

        // Display result
        System.out.println("Modified String: \"" + sb + "\"");
    }
}

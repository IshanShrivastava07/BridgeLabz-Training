import java.util.Scanner;

//creating class AnagramCheck to check if strings are anagram or not
public class AnagramCheck {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter first string");
        String s1 = sc.nextLine().replace(" ", "").toLowerCase();

        System.out.println("Enter second string");
        String s2 = sc.nextLine().replace(" ", "").toLowerCase();

        // If lengths differ, not anagrams
        if (s1.length() != s2.length()) {
            System.out.println("Strings are NOT anagrams");
            return;
        }

        // Convert strings to char arrays
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
		

        // Sort both character arrays using simple bubble sort
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = 0; j < a1.length - 1 - i; j++) {

                if (a1[j] > a1[j + 1]) {
                    char temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }


                if (a2[j] > a2[j + 1]) {
                    char temp = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = temp;
                }
            }
        }

        // Compare sorted arrays
        boolean isAnagram = true;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                isAnagram = false;
                break;
            }
        }


        // Display result
        if (isAnagram) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are NOT anagrams");
        }
    }
}

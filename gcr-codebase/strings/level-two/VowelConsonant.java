import java.util.Scanner;

class VowelConsonant {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the text: ");
       String text = sc.nextLine();

      int[] result = countVowelsAndConsonants(text);

        System.out.println("Vowels count: " + result[0]);
        System.out.println("Consonants count: " + result[1]);
    }

    // Check whether character is Vowel, Consonant or Not a Letter
    public static String checkChar(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
          if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
              return "Vowel";
          } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Count vowels and consonants using charAt()
    public static int[] countVowelsAndConsonants(String str) {

        int vowels = 0;
        int consonants = 0;

        for (int i=0; i < str.length(); i++) {
          String result= checkChar(str.charAt(i));

            if (result.equals("Vowel")) {
                 vowels++;
            } else if (result.equals("Consonant")) {
                 consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
}

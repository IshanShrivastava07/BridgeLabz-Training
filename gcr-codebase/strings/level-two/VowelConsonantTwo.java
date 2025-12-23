import java.util.Scanner;

class VowelConsonantTwo {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the text: ");
        
		String text = sc.nextLine();
		
        String[][] result=findCharTypes(text);

        displayResult(result);
  }

    // Check character type: Vowel, Consonant, Not a Letter
    public static String checkCharType(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
           ch = (char) (ch + 32);
        }
        if (ch >='a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
      return "Not a Letter";
    }
    // Find vowels and consonants and return 2D array
    public static String[][] findCharTypes(String str) {

        String[][] arr = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
          arr[i][0] = String.valueOf(str.charAt(i));
          arr[i][1] = checkCharType(str.charAt(i));
        }

       return arr;
    }

    // Display 2D array in tabular format
    public static void displayResult(String[][] arr) {


       System.out.println("\nCharacter\tType");
       System.out.println("----------------------");


        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }
}

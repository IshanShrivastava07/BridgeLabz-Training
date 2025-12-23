import java.util.Scanner;

class CharArrayString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.next();

      char[] userDefinedArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean isSame = compareCharArrays(userDefinedArray, builtInArray);

     System.out.println("Characters using user-defined method:");
        printArray(userDefinedArray);

        System.out.println("Characters using toCharArray():");
         printArray(builtInArray);

        System.out.println("Both character arrays are equal: " + isSame);
    }
	
    // Returns characters using charAt()
    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }
    // Compares two char arrays
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
			}
     return true;
    }

    // Prints char array
    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

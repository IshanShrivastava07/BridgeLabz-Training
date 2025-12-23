import java.util.Scanner;

class StringIndexOutOfBoundsExc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text=sc.next();

        // Calling method that generates the exception
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main");
        }

        // Calling method that handles the exception
          handleException(text);
    }

    // Method to generate StringIndexOutOfBoundsException
  public static void generateException(String str) {
        // Accessing index beyond string length
      System.out.println(str.charAt(str.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled using try-catch");
      }
  }
}

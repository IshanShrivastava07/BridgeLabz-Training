import java.util.Scanner;

class IllegalArgumentExc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Calling method that generates IllegalArgumentException
        try {
       generateException(text);
        } catch (IllegalArgumentException e) {
        System.out.println("IllegalArgumentException caught in main");
        }

        // Calling method that handles the RuntimeException
        handleException(text);
    }

    // Method to generete IllegalArgumentException
    public static void generateException(String str) {
        // start index > end index
        System.out.println(str.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
      } catch (IllegalArgumentException e) {
          System.out.println("IllegalArgumentException handled using try-catch");
      } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
       }
    }
}

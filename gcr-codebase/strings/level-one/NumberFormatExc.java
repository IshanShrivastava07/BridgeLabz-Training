import java.util.Scanner;

class NumberFormatExc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text value: ");
        String text = sc.next();

        // Calling method that generates NumberFormatException
        try {
          generateException(text);
        } catch (NumberFormatException e) {
     System.out.println("NumberFormatException caught in main");
        }

           // Calling method that handles the RuntimeException
               handleException(text);
   }

    // Method to generate NumberFormatException
     public static void generateException(String str) {
        // This will throw NumberFormatException if string is not numeric
       int number = Integer.parseInt(str);
    System.out.println("Parsed number : " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String str) {
        try {
        int number = Integer.parseInt(str);
          System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
          System.out.println("NumberFormatException handled using try-catch");
        } catch (RuntimeException e) {
       System.out.println("Generic RuntimeException handled");
        }
    }
}

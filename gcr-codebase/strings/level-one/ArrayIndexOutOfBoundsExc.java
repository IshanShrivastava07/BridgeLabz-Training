import java.util.Scanner;

class ArrayIndexOutOfBoundsExc {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of names: ");
     int n = sc.nextInt();

      String[] names = new String[n];

      System.out.println("Enter names:");
       for (int i = 0; i < n; i++)
		   {
             names[i] = sc.next();
           }

        // Calling method that generates ArrayIndexOutOfBoundsException
        try {
          generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBoundsException caught in main");
        }

        // Calling method that handles the RuntimeException
        handleException(names);
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] arr) {
      // Accessing index beyond array length
      System.out.println(arr[arr.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] arr) {
        try {
          System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBoundsException handled using try-catch");
        } catch (RuntimeException e) {
         System.out.println("Generic RuntimeException handled");
        }
    }
}

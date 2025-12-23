import java.util.Scanner;

class StringLength{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();
		
       System.out.println("Length using user-defined method: " + customLength);
      System.out.println("Length using length() method: " + builtInLength);
    }

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
         while (true) {
            str.charAt(count);
            count++;
          }
        } catch (StringIndexOutOfBoundsException e) {
          // Exception occurs when index exceeds string length
        }
      return count;
    }
}

import java.util.Scanner;


 // Creating class BasicCalculator that performs basic arithmetic operations
public class BasicCalculator {

    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();


        switch (choice) {
         case 1 -> System.out.println("Result: " + add(a, b));
          case 2 -> System.out.println("Result: " + subtract(a, b));
          case 3 -> System.out.println("Result: " + multiply(a, b));
          case 4 -> System.out.println("Result: " + divide(a, b));
         default -> System.out.println("Invalid choice");
        }
    }
}

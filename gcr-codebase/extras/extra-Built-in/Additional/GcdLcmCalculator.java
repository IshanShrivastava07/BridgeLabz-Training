import java.util.Scanner;


 // create class GcdLcmCalculator that calculates GCD and LCM of two numbers
public class GcdLcmCalculator {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD is: " + gcd(a, b));
        System.out.println("LCM is: " + lcm(a, b));
    }
}

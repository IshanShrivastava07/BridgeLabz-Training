import java.util.Scanner;

// Creating class DoubleOpt to perform operations using double values
class DoubleOperation {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking double inputs from user
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Performing double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Displaying the results
        System.out.println(
            "The results of Double Operations are " +   result1 + ", " + result2 + ", "+
			result3 + ", and " + result4 );
    }
}

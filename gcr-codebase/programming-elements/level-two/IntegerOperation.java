import java.util.Scanner;

// Creating class IntegerOperation to perform integer operations and understand operator precedence
class IntegerOperation {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking integer inputs from user
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Performing integer operations based on operator precedence
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Displaying the results
        System.out.println(  "The results of Int Operations are " + result1 + ", " + result2 + ", " +
            result3 + ", and " + result4);
    }
}

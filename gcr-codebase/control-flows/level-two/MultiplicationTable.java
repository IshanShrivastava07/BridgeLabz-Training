import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Take the number for the table as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // use For Loop to find multiplication from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner
        sc.close();
    }
}
import java.util.Scanner;

// Creating a class to find the side of a square
class SquareSide {
    public static void main(String[] args) {

        // Creating scanner to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking perimeter of the square from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Finding the side by dividing perimeter by 4
        double side = perimeter / 4;

        // Displaying the result
        System.out.println(
            "The length of the side is " + side + " whose perimeter is " + perimeter
        );
    }
}


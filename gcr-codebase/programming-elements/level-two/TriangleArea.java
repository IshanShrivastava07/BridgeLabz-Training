import java.util.Scanner;

// Creating class TriangleArea to calculate area of a triangle
class TriangleArea {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking base and height in centimeters from user
        double base = input.nextDouble();
        double height = input.nextDouble();

        // Calculating area in square centimeters
        double areaInSqCm = 0.5 * base * height;

        // Converting centimeters to inches (1 inch = 2.54 cm)
        double baseInInches = base / 2.54;
        double heightInInches = height / 2.54;

        // Calculating area in square inches
        double areaInSqIn = 0.5 * baseInInches * heightInInches;

        // Displaying the result
        System.out.println(
            "The Area of the triangle in sq in is " + areaInSqIn + " and sq cm is " + areaInSqCm
        );
    }
}

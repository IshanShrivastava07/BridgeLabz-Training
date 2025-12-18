import java.util.Scanner;

//creating AreaOfTriangle class for finding area of triangle
public class AreaOfTriangle {
    public static void main(String[] args) {

        //Creating Scanner object
        Scanner input = new Scanner(System.in);

        //Taking base and height as input
        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        //Area in square inches
        double areaInSqInches = 0.5 * base * height;
        //Convert square inches to square centimeters
        double areaInSqCm = areaInSqInches * 6.4516;

        //Print result
        System.out.println(
            "The area of the triangle with base " + base + " inches and height " + height + " inches is " +
			areaInSqInches + " square inches and " +   areaInSqCm + " square centimeters." );
    }
}

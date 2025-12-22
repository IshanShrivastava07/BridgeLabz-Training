import java.util.Scanner;

//creating class CollinearPoints to display collinear points
public class CollinearPoints {

    public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Cross-multiplication to avoid division by zero
        return (y2 - y1)*(x3 - x2) ==(y3 - y2) * (x2 - x1)
      && (y2 - y1) * (x3-x1) == (y3 - y1) * (x2 - x1);
    }

    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3)
                       + x2 * (y3 - y1)
                 + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample input: A(2,4), B(4,6), C(6,8)
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();int y1 = sc.nextInt();
        
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeResult = isCollinearBySlope(x1, y1, x2,y2,x3, y3);
        boolean areaResult = isCollinearByArea(x1, y1, x2,y2, x3, y3);

        System.out.println("Collinear using Slope Formula: " + slopeResult);
        System.out.println("Collinear using Area Formula: " + areaResult);
    }
}

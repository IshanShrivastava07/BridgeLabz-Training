import java.util.Scanner;

public class ShopkeeperDiscount {

    // discount constants
    static final double DISCOUNT10 = 0.10;
    static final double DISCOUNT20 = 0.20;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total = 0;

        // taking item prices using for loop
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter price of item " + i + ": ");
            total += sc.nextDouble();
        }

        // discount logic using if-else
        if (total >= 2000) {
            total = total - (total * DISCOUNT20);
        } else if (total >= 1000) {
            total = total - (total * DISCOUNT10);
        }

        System.out.println("Final Bill Amount: ₹" + total);
        sc.close();
    }
}

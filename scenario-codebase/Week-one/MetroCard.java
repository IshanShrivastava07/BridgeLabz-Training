import java.util.Scanner;

public class MetroCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 200; // initial balance

        while (balance > 0) {
       System.out.println("Current Balance: ₹" + balance);
       System.out.print("Enter distance in km (0 to quit): ");
            int distance = sc.nextInt();

            if (distance == 0) break;

// calculating fare
  double fare = (distance <= 5) ? 10 : (distance <= 15) ? 20 : 30;

            if (fare <= balance) {
                balance -= fare;
        System.out.println("Fare deducted: ₹" + fare);
            } else
	 System.out.println("Insufficient balance.");
                break;
            }
        }
        System.out.println("Journey ended.");
        sc.close();
    }
}

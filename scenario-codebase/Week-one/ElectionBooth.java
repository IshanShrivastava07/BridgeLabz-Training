import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter age (or -1 to exit): ");
            int age = sc.nextInt();

            // exit condition
            if (age == -1) {
                System.out.println("Polling ended.");
                break;
            }

            // eligibility check
            if (age >= 18) {
                System.out.print("Vote for candidate (1 || 2 || 3): ");
                int vote = sc.nextInt();
                System.out.println("Vote recorded for candidate " + vote);
            } else {
                System.out.println("Not eligible to vote.");
            }
        }
        sc.close();
    }
}

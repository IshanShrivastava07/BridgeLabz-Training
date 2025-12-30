import java.util.Scanner;

public class PhoneRecharge {
	
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
      int balance = 0;

        while (true) {
            System.out.print("Enter Operator (Jio/Airtel/VI) or Exit: ");
            String operator = sc.next();

            if (operator.equalsIgnoreCase("Exit"))
                break;

            System.out.print("Enter recharge amount: ");
            int amount = sc.nextInt();
            balance += amount;

            // switch for offers
            switch (operator.toLowerCase()) {
                case "jio":
                    System.out.println("Offer: 1GB/day");
                    break;
                case "airtel":
                    System.out.println("Offer: Unlimited calls");
                    break;
                case "vi":
                    System.out.println("Offer: Weekend data rollover");
                    break;
                default:
                    System.out.println("Invalid operator");
            }

            System.out.println("Current Balance: ₹" + balance);
        }
        sc.close();
    }
}

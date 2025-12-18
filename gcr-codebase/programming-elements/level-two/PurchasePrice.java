import java.util.Scanner;

// Creating class PurchasePrice to calculate total purchase price
class PurchasePrice {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking unit price from user
        double unitPrice = input.nextDouble();

        // Taking quantity from user
        int quantity = input.nextInt();

        // Calculating total purchase price
        double totalPrice = unitPrice * quantity;

        // Displaying the result
        System.out.println(
            "The total purchase price is INR " + totalPrice +  " if the quantity " + quantity +    " and unit price is INR " + unitPrice
        );
    }
}

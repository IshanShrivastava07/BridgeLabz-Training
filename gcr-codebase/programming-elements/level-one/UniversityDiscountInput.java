import java.util.Scanner;
//creating class for University Discount
public class UniversityDiscountInput {
    public static void main(String[] args) {

        // Declaring variables
        double fee, discountPercent, discount, finalFee;
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        // Taking fee as user input
        fee = input.nextDouble();
        discountPercent = input.nextDouble();
        // Calculating discount amount
        discount = (fee * discountPercent) / 100;
        // Calculating final fee
        finalFee = fee - discount;

        // Display output
        System.out.println(
            "The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee );
    }
}








//creating class UniversityDiscount to provide students with discount in their fess
public class UniversityDiscount{
	public static void main(String args[]){
		//assigning fee
		int fee = 125000;
		//discount percentage which will be applied to University fee
int discountPercentage = 10;
		//Discounted fee
		double discount = (fee * discountPercentage) / 100;
		//Final fees to be paid
		double FinalFee = fee - discount;
		//Displaying discount and final fee
		System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + FinalFee);
	}
}
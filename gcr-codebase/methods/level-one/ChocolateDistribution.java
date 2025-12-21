import java.util.*;

// Creating class ChocolateDistribution to divide chocolates among children
class ChocolateDistribution {
	
	// Method to find chocolates per child and remaining chocolates
    public static int[] divideChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatePerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatePerChild, remainingChocolates};
    }

    public static void main(String[] args) {
		
		// Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter number of chocolates:");
        int numberOfChocolates = sc.nextInt();

        System.out.println("Enter number of children:");
        int numberOfChildren = sc.nextInt();

        // Calling method
        int[] result = divideChocolates(numberOfChocolates, numberOfChildren);

        // Displaying result
        System.out.println("Each child gets " + result[0] + " chocolates");
        System.out.println("Remaining chocolates are " + result[1]);
    }
}







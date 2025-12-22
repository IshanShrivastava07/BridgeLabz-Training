import java.util.Scanner;

// creating class FriendsComparison to find the youngest and tallest among Amar, Akbar, and Anthony
public class FriendsComparison {

    // Method to find the youngest friend
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find the tallest friend
    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // psvm
    public static void main(String[] args) {
	
	//creating scanner object
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        System.out.println("Youngest friend is " + names[youngestIndex] +
                " with age " + ages[youngestIndex]);

        System.out.println("Tallest friend is " + names[tallestIndex] +
                " with height " + heights[tallestIndex] + " cm");

        sc.close();
    }
}

import java.util.*;

class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();   // usually 10

        int[] ages = generateRandomAges(n);
        String[][] result = checkVotingEligibility(ages);

        displayResult(result);
		}

    // Generate random 2-digit ages
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i<n; i++) {
          ages[i] = rand.nextInt(90) + 10; // random 2-digit age (10–99)
        }
        return ages;
    }
    // Checking voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }
    // Display result in tabular format
    public static void displayResult(String[][] arr) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }
}


// Creating class FootballTeamHeight to find shortest, tallest and mean height of football players
public class FootballTeamHeight {

    // Method to find sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int n : heights) {
            sum += n;
        }
        return sum;
    }

    // creating method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // creating method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int n: heights) {
            if (n < min) {
                min = n;
        }
        
    }
	return min;
	}
	
    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    // psvm
    public static void main(String[] args) {

        int[] heights = new int[11];

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        System.out.println("Player Heights (cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println();

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        System.out.println("\nShortest Height = " + shortest + " cm");
        System.out.println("Tallest Height = " + tallest + " cm");
        System.out.println("Mean Height = " + mean + " cm");
    }
}

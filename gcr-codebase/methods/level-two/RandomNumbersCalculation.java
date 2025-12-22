import java.util.Scanner;

// Creating a class RandomNumbersCalcuation to generate 4-digit random numbers and find average, min, max
public class RandomNumbersCalculation {

    // Method to generate array of 4 digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
           // random number between 1000 and 9999
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    // Method to find average, min and max
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        double average = (double) sum / numbers.length;
		
		// returns array - [average, min, max]
        return new double[]{average, min, max};
    }

    // Creating main method
    public static void main(String[] args) {

        int size =5;

        int[] randomNumbers = generate4DigitRandomArray(size);
        
        System.out.println("Generated 4-digit numbers:");
        for (int n : randomNumbers) {
            System.out.println(n);
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + result[1]);
        System.out.println("Maximum = " + result[2]);
    }
}

import java.util.Scanner;

// Creating class BMICalculator to calculate BMI of 10 team members
public class BMICalculator {

    // Method to calculate BMI and store in 3rd column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];        // kg
            double heightCm = data[i][1];      // cm
            double heightM = heightCm / 100;   // convert cm to meters

            data[i][2] = weight / (heightM * heightM); // BMI
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    // Creating main method
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        double personData[][] = new double[10][3];

        // Input weight and height
        for (int i = 0; i < personData.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(personData);

        // Get BMI status
        String[] bmiStatus = determineBMIStatus(personData);

        // Display result
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < personData.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    personData[i][1],
                    personData[i][0],
                    personData[i][2],
                    bmiStatus[i]);
        }
        sc.close();
    }
}

import java.util.*;

public class BMIReport {

    // Method to calculate BMI and status for one person
    public static String[] calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);

        String status;
      if (bmi < 18.5)
            status = "Underweight";
      else if (bmi < 25)
               status = "Normal";
      else if (bmi < 30)
           status = "Overweight";
       else
            status = "Obese";

      return new String[] {
                String.valueOf(heightCm),
                String.valueOf(weightKg),
                String.format("%.2f", bmi),
                status
      };
	  }

    // Method to process height-weight array and return result array
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return result;
    }

  // Method to display result in tabular format
    public static void display(String[][] result) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

   // Creating Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // [weight, height]

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(data);
        display(result);
    }
}

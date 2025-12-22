import java.util.Random;

// Creating class ZaraEmployeeBonus to calculate employee bonus
public class ZaraEmployeeBonus {

    // method to generate salary and years of service
    public static int[][] generateEmployeeData(int employees) {
        Random rand = new Random();
        int[][] data = new int[employees][2]; // [salary, yearsOfService]

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + rand.nextInt(10);       // 1 to 10 years
        }
        return data;
    }
    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2]; // [newSalary, bonus]

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to calculate totals and display
    public static void displayReport(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];

            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f%n",
                    i + 1, oldData[i][0], oldData[i][1], newData[i][1], newData[i][0]);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t\t%.2f\t%.2f%n",
                totalOldSalary, totalBonus, totalNewSalary);
    }
    public static void main(String[] args) {
        int employees = 10;

        int[][] employeeData = generateEmployeeData(employees);
        double[][] updatedData = calculateBonus(employeeData);
        displayReport(employeeData, updatedData);
    }
}

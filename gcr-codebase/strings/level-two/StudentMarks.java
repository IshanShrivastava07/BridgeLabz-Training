import java.util.Scanner;

class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcmScores = generatePCMScores(n);
        double[][] calculations = calculateTotalAvgPercent(pcmScores);
        String[] grades = calculateGrades(calculations);

        displayScoreCard(pcmScores, calculations, grades);
    }

    // Generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int n) {
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 51) + 50; // Physics
           scores[i][1] = (int) (Math.random() * 51) + 50; // Chemistry
         scores[i][2] = (int) (Math.random() * 51) + 50; // Maths
        }
        return scores;
    }

    // Calculating total, average, percentage
    public static double[][] calculateTotalAvgPercent(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // Calculate grade based on percentage
    public static String[] calculateGrades(double[][] data) {

        String[] grades = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double p = data[i][2];

            if (p >= 90) grades[i] = "A+";
          else if (p >= 80) grades[i] = "A";
           else if (p >= 70) grades[i] = "B";
           else if (p >= 60) grades[i] = "C";
          else if (p >= 50) grades[i] = "D";
            else grades[i] = "Fail";
        }
        return grades;
		}

    // Display scorecard
    public static void displayScoreCard(int[][] scores, double[][] calc, String[] grades) {

        System.out.println("\nPhy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
              scores[i][0] + "\t" +
                scores[i][1] + "\t" +
              scores[i][2] + "\t" +
                (int) calc[i][0] + "\t" +
              calc[i][1] + "\t" +
              calc[i][2] + "\t" +
                grades[i]
            );
        }
    }
}

import java.util.Scanner;

//creating class StudentMarksCalculation to displayy student scorecard
public class StudentMarksCalculation {

    // Method to generate Random 2 digit PCM marks
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3]; // P, C, M

        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + (int) (Math.random() * 90);
            scores[i][1] = 10 + (int) (Math.random() * 90);
            scores[i][2] = 10 + (int) (Math.random() * 90);
        }
        return scores;
    }
    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] pcm) {
        double[][] result = new double[pcm.length][3]; // total, avg, %

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }
    // Method to display scorecard
    public static void displayScorecard(int[][] pcm, double[][] result) {
        System.out.println("Stu\tPhysics\tChem\tMaths\tTotal\tAverage\tPercent");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                    (i + 1) +"\t" +
                    pcm[i][0] + "\t" + pcm[i][1] +"\t"  +
                    pcm[i][2] + "\t" + result[i][0] +"\t" +
                    result[i][1] +"\t"  +
                    result[i][2]
            );                   
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] pcmScores = generatePCMScores(students);
        double[][] results = calculateResults(pcmScores);
        displayScorecard(pcmScores, results);
    }
}

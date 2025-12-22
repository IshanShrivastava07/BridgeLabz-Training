import java.util.Scanner;

// Creating class StudentVoteCheck to check voting eligibility of 10 students
public class StudentVoteCheck {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        // Validate age
        if (age<0) {
            return false; // invalid age cannot vote
        }
        // Check voting eligibility
        if (age >= 18) {
            return true;
        }
        return false;
    }

    //creating Main method 
    public static void main(String[] args) {

        //Creating scanner object
        Scanner sc = new Scanner(System.in);
        StudentVoteCheck checker = new StudentVoteCheck();

        // Array to store ages of 10 students
        int[] studentAges = new int[10];

        // Looping to take input and check voting eligibility
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            boolean canVote = checker.canStudentVote(studentAges[i]);

            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered.");
            } else if (canVote) {
                System.out.println("The student with age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("The student with age " + studentAges[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}

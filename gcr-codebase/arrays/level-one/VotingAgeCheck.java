import java.util.Scanner;

// creating class VotingAgeCheck to check voting eligibility of 10 students based on their age
public class VotingAgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // array to store ages of 10 students
        int[] ages = new int[10]; 

        // taking input
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        // checking voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }
}

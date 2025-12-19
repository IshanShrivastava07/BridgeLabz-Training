import java.util.Scanner;

// Creating class EligibleVotingAge to check voting eligibility
class EligibleVotingAge {
    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking age from user
        int age = input.nextInt();

        // Checking voting eligibility
        if (age >= 18) {
            System.out.println(
                "The person's age is " + age +
                " and can vote."
            );
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");   
        }
    }
}

import java.util.Scanner;
import java.util.Random;

//Creating class NumberGuessingGame to build number guessing game
public class NumberGuessingGame {

    // Method to generate a random guess
    static int generateGuess(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
      }
	
	
    // Method to take user feedback
    static String getFeedback(Scanner sc) {
        System.out.print("Is the guess high, low or correct? ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1, high = 100;
        String feedback;

        System.out.println("Think of a number between 1 and 100.");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Computer guessed it correctly!");
                break;
          } else if (feedback.equals("high")) {
                high = guess - 1;
          } else if (feedback.equals("low")) {
               low = guess + 1;
       }
    }
    }
}

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int guess, attempts = 0;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high");
            } else if (guess < number) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! Attempts: " + attempts);
                break;
            }

        } while (attempts < 5){
			
        if (attempts == 5 && guess != number) {
          System.out.println("Game Over! Number was: " + number);
      }
        sc.close();
    }
}

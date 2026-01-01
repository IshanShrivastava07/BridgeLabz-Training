	
import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int visitor = 1; visitor <= 5; visitor++) {
            System.out.print("Visitor " + visitor + " enter your number: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Invalid number");
                continue;
            }

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift ****//****");
            } else {
                System.out.println("Better luck next time");
            }
        }

        sc.close();
    }
}

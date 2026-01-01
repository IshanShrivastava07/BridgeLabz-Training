import java.util.Scanner;

public class OnlineQuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String[] questions = {
            "1. Java is a ___ language?",
             "2. Which keyword is used to inherit a class?",
              "3. Size of int in Java?",
               "4. Which loop runs at least once?",
                "5. JVM stands for?"
        };

      String[][] options = {
            {"a) Low-level", "b) High-level", "c) Machine", "d) Assembly"},
             {"a) this", "b) super", "c) extends", "d) implement"},
              {"a) 2 bytes", "b) 4 bytes", "c) 8 bytes", "d) Depends"},
               {"a) for", "b) while", "c) do-while", "d) foreach"},
                {"a) Java Virtual Machine", "b) Java Variable Method", "c) Joint Virtual Model", "d) None"}
        };

        char[] correctAnswers = {'b', 'c', 'b', 'c', 'a'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter answer (a/b/c/d): ");
            char answer = sc.next().toLowerCase().charAt(0);

            switch (answer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (answer == correctAnswers[i]) {
                        score++;
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        System.out.println("\nFinal Score: " + score + "/5");
        sc.close();
    }
}

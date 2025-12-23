import java.util.Scanner;

class RockPaperScissor {

    static String[] choices = {"Rock", "Paper", "Scissors"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println("\nGame\tUser\t\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 1; i <= games; i++) {

            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            System.out.println(i + "\t" + userChoice + "\t\t" + computerChoice + "\t\t" + winner);
        }

        String[][] stats = calculateStats(games, userWins, computerWins);
        displayStats(stats);
    }

    // Computer choice using Math.random()
    public static String getComputerChoice() {
        int index = (int) (Math.random() * 3);
        return choices[index];
    }

    // Find winner
    public static String findWinner(String user, String computer) {

        user = user.toLowerCase();
        computer = computer.toLowerCase();

        if (user.equals(computer)) return "Draw";

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    // Calculate average and percentage
    public static String[][] calculateStats(int games, int userWins, int computerWins) {

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / games);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100.0) / games);

        return stats;
    }

    // Display final stats
    public static void displayStats(String[][] stats) {

        System.out.println("\nPlayer\tWins\tWin Percentage");
        System.out.println("----------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                Double.parseDouble(stats[i][2]) + "%"
            );
        }
    }
}

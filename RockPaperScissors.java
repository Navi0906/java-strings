import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int number = sc.nextInt();
        
        String[][] results = new String[number][3];
        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("Enter your choice : ");
            String playerChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);
            
            results[i][0] = playerChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        String[][] stats = calculateStats(playerWins, computerWins, number);
        displayResults(results, stats);
        
    }

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        return choice == 0 ? "rock" : choice == 1 ? "paper" : "scissors";
    }

    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
            (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "Player";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "Player Wins";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", (playerWins * 100.0 / totalGames));
        
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", (computerWins * 100.0 / totalGames));
        
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Player Choice    Computer Choice   Winner");
        for (String[] result : results) {
            System.out.println(result[0] + "             " + result[1] + "             " + result[2]);
        }

        System.out.println("\nStatistics:");
        System.out.println(stats[0][0] + ": " + stats[0][1] + " (" + stats[0][2] + ")");
        System.out.println(stats[1][0] + ": " + stats[1][1] + " (" + stats[1][2] + ")");
    }
}
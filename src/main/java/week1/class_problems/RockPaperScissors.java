package week1.class_problems;

import java.util.Random;
import java.util.Scanner;

    public class RockPaperScissors {

        static String playRound(String playerMove, String computerMove) {

            if (playerMove.equals(computerMove)) {
                return "Draw";
            }

            if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                    (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                    (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
                return "Player Wins";
            }

            return "Computer Wins";
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Random random = new Random();

            String[] moves = {"Rock", "Paper", "Scissors"};

            int wins = 0;
            int losses = 0;
            int draws = 0;

            System.out.print("Enter number of rounds: ");
            int n = sc.nextInt();

            System.out.println("\nRound\tPlayer\t\tComputer\tResult");

            for (int i = 1; i <= n; i++) {

                System.out.print("Enter your move (Rock/Paper/Scissors): ");
                String playerMove = sc.next();

                // Convert first letter to uppercase and remaining letters to lowercase
                playerMove = playerMove.substring(0, 1).toUpperCase()
                        + playerMove.substring(1).toLowerCase();

                String computerMove = moves[random.nextInt(3)];

                String result = playRound(playerMove, computerMove);

                if (result.equals("Player Wins")) {
                    wins++;
                } else if (result.equals("Computer Wins")) {
                    losses++;
                } else {
                    draws++;
                }

                System.out.println(i + "\t" + playerMove + "\t\t"
                        + computerMove + "\t\t" + result);
            }

            double winPercentage = (wins * 100.0) / n;

            System.out.println("\nFinal Summary");
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            System.out.println("Draws: " + draws);
            System.out.printf("Win Percentage: %.1f%%%n", winPercentage);

            sc.close();
        }
    }


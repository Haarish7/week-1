import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String compCh() {
        String[] ch = {"Rock", "Paper", "Scissors"};
        int index = new Random().nextInt(3);
        return  ch[index];
    }

    public static String winner(String playerCh, String compCh) {
        if (playerCh.equalsIgnoreCase(compCh)) {
            return "Draw";
        } else if (
                (playerCh.equalsIgnoreCase("Rock") && compCh.equals("Scissors")) ||
                        (playerCh.equalsIgnoreCase("Scissors") && compCh.equals("Paper")) ||
                        (playerCh.equalsIgnoreCase("Paper") && compCh.equals("Rock"))
        ) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] calcStats(int pWins, int cWins, int totalGames) {
        String[][] stats = new String[2][2];

        stats[0][0] = "Player";
        stats[0][1] = String.format("%.2f%%", ((double) pWins / totalGames) * 100);

        stats[1][0] = "Computer";
        stats[1][1] = String.format("%.2f%%", ((double) cWins / totalGames) * 100);

        return stats;
    }
    public static void disRes(String[][] gRes, String[][] stats) {
        System.out.println("Game Results = ");
        System.out.printf(" %-10s | %-10s | %-10s | %-8s \n", "Game", "Player", "Computer", "Winner");

        for (String[] res : gRes) {
            System.out.printf(" %-10s | %-10s | %-10s | %-8s \n", res[0], res[1], res[2], res[3]);
        }

        System.out.println("Win Statistics = ");
        System.out.printf(" %-10s | %-10s \n", "Player", "Win %");

        for (String[] stat : stats) {
            System.out.printf(" %-10s | %-10s \n", stat[0], stat[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of games to play = ");
        int numGames = scn.nextInt();
        scn.nextLine();

        String[][] gRes = new String[numGames][4];
        int pWins = 0, cWins = 0, draws = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors) = ");
            String pCh = scn.nextLine();

            if (!pCh.equalsIgnoreCase("Rock") &&
                    !pCh.equalsIgnoreCase("Paper") &&
                    !pCh.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice");
                i--;
                continue;
            }

            String cCh = compCh();
            String winner = winner(pCh, cCh);

            gRes[i][0] = "Game " + (i + 1);
            gRes[i][1] = pCh;
            gRes[i][2] = cCh;
            gRes[i][3] = winner;

            if (winner.equals("Player")) {
                pWins++;
            } else if (winner.equals("Computer")) {
                cWins++;
            } else {
                draws++;
            }
        }

        String[][] stats = calcStats(pWins, cWins, numGames);
        disRes(gRes, stats);

        scn.close();
    }
}

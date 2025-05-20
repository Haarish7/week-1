import java.util.Scanner;
import java.util.Random;

public class Vote {
    public static int[] genAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(82) + 10;
        }

        return ages;
    }

    public static String[][] checkVote(int[] ages) {
        String[][] res = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                res[i][1] = "Invalid";
            } else if (ages[i] >= 18) {
                res[i][1] = "Can vote";
            } else {
                res[i][1] = "Cannot vote";
            }
        }

        return res;
    }

    public static void disRes(String[][] res) {
        System.out.printf(" %-10s | %-12s \n", "Age", "Voting Status");

        for (String[] row : res) {
            System.out.printf(" %-10s | %-12s \n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num of students = ");
        int n = scn.nextInt();

        int[] studAges = genAges(n);
        String[][] res = checkVote(studAges);
        disRes(res);

        scn.close();
    }
}

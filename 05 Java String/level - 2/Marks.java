import java.util.Random;
import java.util.Scanner;

public class Marks {
    public static int[][] genScores(int num) {
        Random rand = new Random();
        int[][] sc = new int[num][3];

        for (int i = 0; i < num; i++) {
            sc[i][0] = rand.nextInt(41) + 60;
            sc[i][1] = rand.nextInt(41) + 60;
            sc[i][2] = rand.nextInt(41) + 60;
        }
        return sc;
    }

    public static double[][] calcPer(int[][] sc) {
        int num = sc.length;
        double[][] res = new double[num][3];

        for (int i = 0; i < num; i++) {
            int ttl = sc[i][0] + sc[i][1] + sc[i][2];
            double per = (ttl / 3.0);
            res[i][0] = ttl;
            res[i][1] = Math.round(per * 100.0) / 100.0;
        }
        return res;
    }

    public static String[] calcGr(double[][] res) {
        int num = res.length;
        String[] gr = new String[num];

        for (int i = 0; i < num; i++) {
            double per = res[i][1];

            if (per >= 80) gr[i] = "A - Level 4, above agency-normalized standards";
            else if (per >= 70) gr[i] = "B - Level 3, at agency-normalized standards";
            else if (per >= 60) gr[i] = "C - Level 2, below, but approaching agency-normalized standards";
            else if (per >= 50) gr[i] = "D - Level 1, well below agency-normalized standards";
            else if (per >= 40) gr[i] = "E - Level 1- , too below agency-normalized standards";
            else gr[i] = "R - Remedial standards";
        }
        return gr;
    }

    public static void disRes(int[][] sc, double[][] res, String[] gr) {
        System.out.println("Student | Physics | Chemistry | Maths | Total | % | Grade");

        for (int i = 0; i < sc.length; i++) {
            System.out.printf("%7d | %7d | %8d | %5d | %5.0f | %.2f | %s\n",
                    (i + 1), sc[i][0], sc[i][1], sc[i][2],
                    res[i][0], res[i][1], gr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num = ");
        int num = scn.nextInt();

        int[][] sc = genScores(num);
        double[][] res = calcPer(sc);
        String[] gr = calcGr(res);
        disRes(sc, res, gr);

        scn.close();
    }
}

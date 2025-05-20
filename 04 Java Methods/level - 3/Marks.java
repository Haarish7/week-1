import java.util.Random;
import java.util.Scanner;

public class Marks {
    public static int[][] genMarks(int numSt) {
        Random random = new Random();
        int[][] marks = new int[numSt][3];

        for (int i = 0; i < numSt; i++) {
            marks[i][0] = 35 + random.nextInt(66);
            marks[i][1] = 35 + random.nextInt(66);
            marks[i][2] = 35 + random.nextInt(66);
        }
        return marks;
    }

    public static double[][] calcRes(int[][] marks) {
        int numSt = marks.length;
        double[][] results = new double[numSt][3];

        for (int i = 0; i < numSt; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(per * 100.0) / 100.0;
        }
        return results;
    }

    public static String getGrade(double per) {
        if (per >= 80) return "A - Level 4, above agency-normalized standards";
        else if (per >= 70) return "B - Level 3, at agency-normalized standards";
        else if (per >= 60) return "C - Level 2, below, but approaching agency-normalized standards";
        else if (per >= 50) return "D - Level 1, well below agency-normalized standards";
        else if (per >= 40) return "E - Level 1- , too below agency-normalized standards";
        else return "R - Remedial standards";
    }

    public static void disRes(int[][] marks, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Avg", "Percentage");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10s\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], results[i][0], results[i][1], getGrade(results[i][2]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students = ");
        int numSt = sc.nextInt();

        int[][] marks = genMarks(numSt);
        double[][] results = calcRes(marks);

        disRes(marks, results);
        
        sc.close();
    }
}

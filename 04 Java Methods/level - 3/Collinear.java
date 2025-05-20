import java.util.Scanner;

public class Collinear {
    public static boolean areColSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double AB = (y2 - y1) / (x2 - x1);
        double BC = (y3 - y2) / (x3 - x2);
        double AC = (y3 - y1) / (x3 - x1);

        return (AB == BC) && (BC == AC);
    }

    public static boolean areColArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter x1, y1 = ");
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        System.out.print("Enter x2, y2 = ");
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();
        System.out.print("Enter x3, y3 = ");
        double x3 = scn.nextDouble();
        double y3 = scn.nextDouble();

        boolean colSlope = areColSlope(x1, y1, x2, y2, x3, y3);
        boolean colArea = areColArea(x1, y1, x2, y2, x3, y3);

        if (colSlope && colArea) {
            System.out.println("Points are collinear");
        } else {
            System.out.println("Points are NOT collinear");
        }

        scn.close();
    }
}

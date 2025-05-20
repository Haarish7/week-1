import java.util.Scanner;

public class EuclideanDist {
    public static double calcDist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] findEq(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];

        double m = (y2 - y1) / (x2 - x1);

        double b = y1 - (m * x1);

        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 = ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1 = ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 = ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2 = ");
        double y2 = sc.nextDouble();

        double distance = calcDist(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f%n", distance);

        if (x1 == x2) {
            System.out.println("The line is vertical. Equation: x = " + x1);
        } else {
            double[] equation = findEq(x1, y1, x2, y2);
            System.out.printf("Equation of the Line: y = %.2fx + %.2f%n", equation[0], equation[1]);
        }

        sc.close();
    }
}

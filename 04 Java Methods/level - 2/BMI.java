import java.util.Scanner;

public class BMI {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String BMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int ppl = 10;
        double[][] perData = new double[ppl][3];
        String[] weightStatus = new String[ppl];
        for (int i = 0; i < ppl; i++) {
            do {
                System.out.print("Enter weight in kg for person " + (i + 1) + " = ");
                perData[i][0] = scn.nextDouble();
                if (perData[i][0] <= 0) {
                    System.out.println("Invalid input");
                }
            } while (perData[i][0] <= 0);

            do {
                System.out.print("Enter height in cm for person " + (i + 1) + ": ");
                perData[i][1] = scn.nextDouble();
                if (perData[i][1] <= 0) {
                    System.out.println("Invalid input");
                }
            } while (perData[i][1] <= 0);

            perData[i][2] = calculateBMI(perData[i][0], perData[i][1]);

            weightStatus[i] = BMIStatus(perData[i][2]);
        }

        System.out.println("\nBMI Report:");
        System.out.printf("%-12s %-12s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < ppl; i++) {
            System.out.printf("%-12.2f %-12.2f %-10.2f %-15s%n", 
                perData[i][1], perData[i][0], perData[i][2], weightStatus[i]);
        }
        scn.close();
    }
}

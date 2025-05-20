import java.util.Scanner;

public class BMI2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num of persons = ");
        int ppl = scn.nextInt();

        double[][] perData = new double[ppl][3]; 
        String[] weightStatus = new String[ppl];

        for (int i = 0; i < ppl; i++) {
            do {
                System.out.print("\nEnter weight in kg for " + (i + 1) + " = ");
                perData[i][0] = scn.nextDouble();
                if (perData[i][0] <= 0) {
                    System.out.println("Invalid. Please enter again.");
                }
            } while (perData[i][0] <= 0);

            do {
                System.out.print("Enter height in cm for " + (i + 1) + " = ");
                perData[i][1] = scn.nextDouble();
                if (perData[i][1] <= 0) {
                    System.out.println("Invalid. Please enter again.");
                }
            } while (perData[i][1] <= 0);

            double heightM = perData[i][1] / 100;

            perData[i][2] = perData[i][0] / (heightM * heightM);

            if (perData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (perData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (perData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
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

import java.util.Scanner;

public class BMI {
    public static String[][] calcBMI(double[][] data) {
        int per = data.length;
        String[][] bmiRes = new String[per][4];

        for (int i = 0; i < per; i++) {
            double w = data[i][0];
            double hCm = data[i][1];
            double hM = hCm / 100;
            double bmi = w / (hM * hM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String st;
            if (bmi < 18.5) {
                st = "Underweight";
            } else if (bmi < 25) {
                st = "Normal Weight";
            } else if (bmi < 30) {
                st = "Overweight";
            } else {
                st = "Obese";
            }

            bmiRes[i][0] = String.format("%.2f", w);
            bmiRes[i][1] = String.format("%.2f", hCm);
            bmiRes[i][2] = String.format("%.2f", bmi);
            bmiRes[i][3] = st;
        }

        return bmiRes;
    }

    public static void disRes(String[][] bmiRes) {
        System.out.println("Person |  Weight (kg) | Height (cm) | BMI  | Status");

        for (int i = 0; i < bmiRes.length; i++) {
            System.out.printf("%6d | %11s | %10s | %5s | %s\n", (i + 1), bmiRes[i][0], bmiRes[i][1], bmiRes[i][2], bmiRes[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int per = 10;
        double[][] data = new double[per][2];

        for (int i = 0; i < per; i++) {
            System.out.printf("Enter weight (kg) for person %d = ", i + 1);
            data[i][0] = scn.nextDouble();
            System.out.printf("Enter height (cm) for person %d = ", i + 1);
            data[i][1] = scn.nextDouble();
        }

        String[][] bmiRes = calcBMI(data);
        disRes(bmiRes);

        scn.close();
    }
}

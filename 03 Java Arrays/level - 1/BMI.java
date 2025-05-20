import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number of persons = ");
		int ppl = scn.nextInt();
		
		double[] weights = new double[ppl];
		double[] heights = new double[ppl];
		double[] bmiValues = new double[ppl];
		String[] weightStatus = new String[ppl];
		
		for (int i = 0; i < ppl; i++) {
			System.out.print("Enter weight in kg for " + (i + 1) + " = ");
			weights[i] = scn.nextDouble();
			
			System.out.print("Enter height in cm for " + (i + 1) + " = ");
			heights[i] = scn.nextDouble();
		
			double heightM = heights[i] / 100;
		
			bmiValues[i] = weights[i] / (heightM * heightM);
		
			if (bmiValues[i] <= 18.4) {
				weightStatus[i] = "Underweight";
			} else if (bmiValues[i] <= 24.9) {
				weightStatus[i] = "Normal";
			} else if (bmiValues[i] <= 39.9) {
				weightStatus[i] = "Overweight";
			} else {
				weightStatus[i] = "Obese";
			}
		}
			
		System.out.println("\nBMI Report: ");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < ppl; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", heights[i], weights[i], bmiValues[i], weightStatus[i]);
        }
		scn.close();
	}
}

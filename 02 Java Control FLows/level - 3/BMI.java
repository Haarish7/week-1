import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter weight in kg = ");
		double weight = scn.nextDouble();
		
		System.out.print("Enter height in in cms = ");
		double height = scn.nextDouble();
		
		double heightM = height / 100;
		
		double bmi = weight / (heightM * heightM);
		
		if (bmi <= 18.4) {
			System.out.println("Underweight");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Normal");
		} else if (bmi >= 25.0 && bmi <= 39.9) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
		
		scn.close();
	}
}

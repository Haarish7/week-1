import java.util.Scanner;

public class Football {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double[] team = new double[11];
		
		for (int i = 0; i < 11; i++) {
			System.out.print("Enter height in cms = ");
			team[i] = scn.nextDouble();
		}
		double sum = 0;
		
		for (int i = 0; i < team.length; i++) {
			sum += team[i];
		}
		
		double mean = sum / team.length;
		
		System.out.println("Mean height of team is = " + mean);
		
		scn.close();		
	}
}

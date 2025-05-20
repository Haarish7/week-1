import java.util.Scanner;

public class Miles2 {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter kilometers = ");
		double kilo = scn.nextDouble();
	
		double miles = kilo * 1.6;
		
		System.out.println("The total miles is " + miles + " mile for the given " + kilo + " km");
		
		scn.close();
	}
}

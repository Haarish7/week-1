import java.util.Scanner;

public class Weight {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter weights in pounds = ");
		double pound = scn.nextDouble();
				
		double kilo = pound / 2.2;
		
		System.out.println("The weight of the person in pound is " + pound + " and in kg is " + kilo);
		
		scn.close();
	}
}

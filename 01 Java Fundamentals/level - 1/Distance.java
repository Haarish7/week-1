import java.util.Scanner;

public class Distance {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter distance in feet = ");
		double feet = scn.nextDouble();
	
		double yard = feet / 3;
		
		double mile = yard / 1760;
		
		System.out.println("The distance in feet is " + feet + " while in yard is " + yard + " and miles is " + mile);
		
		scn.close();
	}
}

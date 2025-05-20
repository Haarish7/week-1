import java.util.Scanner;

public class Height {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter height in cms = ");
		double height = scn.nextDouble();
	
		double inch = height / 2.54;
		
		double feet = inch / 12;
		
		System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inch);
		
		scn.close();
	}
}

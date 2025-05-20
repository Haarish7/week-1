import java.util.Scanner;

public class SI {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Principal = ");
		double principal = scn.nextDouble();
		
		System.out.print("Enter Rate = ");
		double rate = scn.nextDouble();
		
		System.out.print("Enter Time = ");
		double time = scn.nextDouble();
		
		double si = (principal * rate * time) / 100;
		
		System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
		scn.close();
	}
}

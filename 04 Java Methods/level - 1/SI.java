import java.util.Scanner;

public class SI {
	public double SI(double principal, double rate, double time) {
		double si = (principal * rate * time) / 100;
		return si;
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		SI si = new SI();
		
		System.out.print("Enter Principal = ");
		double principal = scn.nextDouble();
		
		System.out.print("Enter Rate = ");
		double rate = scn.nextDouble();
		
		System.out.print("Enter Time = ");
		double time = scn.nextDouble();
		
		double res = si.SI(principal, rate, time);
		
		System.out.println("The Simple Interest is " + res + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
		scn.close();
	}
}

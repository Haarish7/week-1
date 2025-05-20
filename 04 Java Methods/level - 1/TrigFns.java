import java.util.Scanner;

public class TrigFns {
	public double[] calculateTrigonometricFunctions(double angle) {
		double radians = Math.toRadians(angle);
		
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		double tangent = Math.tan(radians);
		
		return new double[]{sine, cosine, tangent};
	}
	
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		TrigFns trigFns = new TrigFns();
		
		System.out.print("Enter angle in degrees = ");
		double angle = scn.nextDouble();
		
		double[] res = trigFns.calculateTrigonometricFunctions(angle);
		System.out.println("Sine = " + res[0]);
		System.out.println("Cosine = " + res[1]);
		System.out.println("Tangent = " + res[2]);
		
		scn.close();
	}
}

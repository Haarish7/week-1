import java.util.Scanner;

public class PosNeg {
	public int posNegZero(int num) {
		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		return 0;
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		PosNeg posNeg = new PosNeg();
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		int res = posNeg.posNegZero(num);
		
		scn.close();
	}
}

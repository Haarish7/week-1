import java.util.Scanner;

public class Factorial2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		int fact = 1;
		
		if (num > 0){
			for (int i = 1; i <= num; i++) {
				fact *= i;
			}
		} else {
			System.out.println("Not natural number");
		}
		
		System.out.println("Factorial = " + fact);
		
		scn.close();
	}
}

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		int fact = 1, i = 1;
		
		if (num > 0){
			while (i <= num) {
				fact *= i;
				i += 1;
			}
		} else {
			System.out.println("Not natural number");
		}
		
		System.out.println("Factorial = " + fact);
		
		scn.close();
	}
}

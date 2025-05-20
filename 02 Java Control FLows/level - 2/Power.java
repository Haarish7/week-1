import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		System.out.print("Enter power = ");
		int power = scn.nextInt();
		
		int result = 1;
		
		if (num > 0){
			for (int i = 1; i <= power; i++) {
				result *= num;
			}
			System.out.println("Result = " + result);
		} else {
			System.out.println("Not natural number or is above 100");
		}
		
		
		scn.close();
	}
}

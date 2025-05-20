import java.util.Scanner;

public class Power2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		System.out.print("Enter power = ");
		int power = scn.nextInt();
		
		int result = 1;
		int i = 1;
		
		if (num > 0){
			while (i <= power) {
				result *= num;
				i++;
			}
			System.out.println("Result = " + result);
		} else {
			System.out.println("Not natural number or is above 100");
		}
		
		
		scn.close();
	}
}

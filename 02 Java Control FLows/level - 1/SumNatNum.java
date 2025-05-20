import java.util.Scanner;

public class SumNatNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter natural number = ");
		int num = scn.nextInt();
		
		if (num > 0) {
			int sum = (num * (num + 1)) / 2;
			System.out.println("The sum of " + num + " natural numbers is " + sum);
		} else {
			System.out.println(num + " is not a natural number");
		}
		
		scn.close();
	}
}

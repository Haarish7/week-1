import java.util.Scanner;

public class SmallestNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num1 = ");
		int num1 = scn.nextInt();
		
		System.out.print("Enter num2 = ");
		int num2 = scn.nextInt();
		
		System.out.print("Enter num3 = ");
		int num3 = scn.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Is the first number the smallest? " + true);
		} else {
			System.out.println("Is the first number the smallest? " + false);
		}
		
		scn.close();
	}
}

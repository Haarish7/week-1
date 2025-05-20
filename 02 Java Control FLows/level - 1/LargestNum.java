import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num1 = ");
		int num1 = scn.nextInt();
		
		System.out.print("Enter num2 = ");
		int num2 = scn.nextInt();
		
		System.out.print("Enter num3 = ");
		int num3 = scn.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Is the first number the largest? " + true);
			System.out.println("Is the second number the largest? " + false);
			System.out.println("Is the third number the largest? " + false);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Is the first number the largest? " + false);
			System.out.println("Is the second number the largest? " + true);
			System.out.println("Is the third number the largest? " + false);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("Is the first number the largest? " + false);
			System.out.println("Is the second number the largest? " + false);
			System.out.println("Is the third number the largest? " + true);
		}
		scn.close();
	}
}

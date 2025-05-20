import java.util.Scanner;

public class PosNegOddEven {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int [] num = new int[5];
		
		System.out.print("Enter 5 numbers = ");
		for (int i = 0 ; i < 5; i++) {
			num[i] = scn.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				if (num[i] % 2 == 0) {
					System.out.println(num[i] + " is positive and even");
				} else {
					System.out.println(num[i] + " is positive and odd");
				}
			} else if (num[i] == 0) {
				System.out.println(num[i] + " is zero");
			} else if (num[i] < 0) {
				System.out.println(num[i] + " is negative");
			} else {
				System.err.println("Invalid input");
			}
		}
		
		if (num[0] == num[4]) {
			System.out.println("First and last nums are equal");
		} else if (num[0] > num[4]) {
			System.out.println("First num is greater than last");
		} else {
			System.out.println("First num is smaller than last");
		}	
			
		scn.close();		
	}
}

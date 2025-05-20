import java.util.Scanner;

public class findSmallestAndLargest {
	public int smallestNumber(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			System.out.println("First number is the smallest");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("Second number is the smallest");
		} else if (num3 < num1 && num3 < num2) {
			System.out.println("Third number is the smallest");
		}
		return 0;
	}
	
	public int largestNumber(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("First number is the largest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Second number is the largest");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("Third number is the largest");
		}
		return 0;
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		findSmallestAndLargest smallOrLarge = new findSmallestAndLargest();
		
		System.out.print("Enter num1 = ");
		int num1 = scn.nextInt();
		
		System.out.print("Enter num2 = ");
		int num2 = scn.nextInt();
		
		System.out.print("Enter num3 = ");
		int num3 = scn.nextInt();
		
		int res1 = smallOrLarge.smallestNumber(num1, num2, num3);
		int res2 = smallOrLarge.largestNumber(num1, num2, num3);
		
		scn.close();
	}
}

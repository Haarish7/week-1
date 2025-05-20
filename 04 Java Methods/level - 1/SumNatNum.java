import java.util.Scanner;

public class SumNatNum {
	public int Sum(int num) {
		if (num > 0) {
			int sum = (num * (num + 1)) / 2;
			System.out.println("The sum of " + num + " natural numbers is " + sum);
		} else {
			System.out.println(num + " is not a natural number");
		}
		return 0;
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		SumNatNum sum = new SumNatNum();
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		int res = sum.Sum(num);
		
		scn.close();
	}
}

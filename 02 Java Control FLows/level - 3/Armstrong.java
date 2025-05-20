import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int origNum = scn.nextInt();
		
		int num = origNum;
		
		int sum = 0;
		
		while (num > 0) {
			int n = num % 10;
			sum += Math.pow(n,3);
			num /= 10;
		}
		
		if (origNum == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}
		
		scn.close();
	}
}

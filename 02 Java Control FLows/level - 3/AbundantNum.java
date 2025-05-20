import java.util.Scanner;

public class AbundantNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		
		if (num < sum) {
			System.out.println("Abundant Number");
		} else {
			System.out.println("Not abundant number");
		}
		
		scn.close();
	}
}

import java.util.Scanner;

public class HarshadNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		int sum = 0;
		int origNum = num;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		if (origNum % sum == 0) {
			System.out.println("Harshad number");
		} else {
			System.out.println("Not harshad number");
		}		
		
		scn.close();
	}
}

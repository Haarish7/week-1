import java.util.Scanner;

public class NumOfDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int origNum = scn.nextInt();
		
		int num = origNum;
		int count = 0;
		
		if (num == 0) {
			count = 1;
		} else {
			while (num != 0) {
				num /= 10;
				count += 1;
			}
		}
		
		System.out.println("Number of digits = " + count);
		
		scn.close();
	}
}

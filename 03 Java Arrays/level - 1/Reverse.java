import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		int[] digits = new int[10];
		int index = 0;
		
		while (num != 0 && index < 10) {
			digits[index++] = num % 10;
			num /= 10;
		}
		
		if (index == 0) {
            System.out.println("No digits found");
            return;
        }
		
		System.out.print("Reverse = ");
		for (int i = 0; i < index; i++) {
			System.out.print(digits[i]);
		}
		
		scn.close();
	}
}

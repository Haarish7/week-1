import java.util.Scanner;
import java.util.Arrays;

public class DigitsOfNum2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		long num = scn.nextLong();
		
		int maxDigit = 10;
		int[] digits = new int[maxDigit];
		int index = 0;
		
		while (num != 0) {
			if (index == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }
			digits[index++] = (int) Math.abs(num % 10);
			num /= 10;
		}
		
		if (index == 0) {
            System.out.println("No digits found");
            return;
        }
		
		System.out.print("The digits of num are = ");
		for(int i = 0; i < index; i++) {
			System.out.print(digits[i] + " ");
		}
		
		int largest = -1, secondLargest = -1;
		for (int i = 0; i < index; i++) {
			if (digits[i] > largest) {
				secondLargest = largest;
				largest = digits[i];
			} else if (digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}
		
		System.out.println("\nLargest digit = " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit = " + secondLargest);
        } else {
            System.out.println("All digits are the same");
        }
		
		scn.close();
	}
}

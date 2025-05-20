import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		long num = scn.nextLong();
		
		int[] freq = new int[10];
		
		long tempNum = num;
		while (num > 0) {
			int digit = (int) (num % 10);
			freq[digit]++;
			num /= 10;
		}
		
		System.out.println("\nDigit Frequencies in " + tempNum + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " appears " + freq[i] + " times.");
            }
        }
		
        scn.close();
    }
}

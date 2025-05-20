import java.util.Scanner;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a natural number = ");
        int num = scn.nextInt();
		
		int maxFactor = 10;
        int[] factors = new int[maxFactor];
		int index = 0;
		
		if (num <= 0) {
			System.out.println("Not a natural number.");
            return;
		}
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				if (index == maxFactor) {
					maxFactor *= 2;
					factors = Arrays.copyOf(factors, maxFactor);
				}
				factors[index++] = i;
			}
		}
		
		System.out.print("Factors of " + num + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        scn.close();
    }
}

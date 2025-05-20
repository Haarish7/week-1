import java.util.Scanner;
import java.util.Arrays;

public class Factors {
	public static int[] factorArray (int num) {
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		int[] factors = new int[count];
		int index = 0;

		for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
	}

	public static int sumOfFactors (int[] factors) {
		int sum = 0;

		for (int factor : factors) {
			sum += factor;
		}

		return sum;
	}

	public static int sumOfSqFactors (int[] factors) {
		int sumSq = 0;

		for (int factor : factors) {
			sumSq += Math.pow(factor, 2);
		}

		return sumSq;
	}

	public static long productOfFactors (int[] factors) {
		long product = 1;

		for (int factor : factors) {
			product *= factor;
		}

		return product;
	}

	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter num = ");
		int num = scn.nextInt();

		int[] res1 = factorArray(num);
		int res2 = sumOfFactors(res1);
		int res3 = sumOfSqFactors(res1);
		long res4 = productOfFactors(res1);

		System.out.println("Factors = " + Arrays.toString(res1));
		System.out.println("Sum of factors = " + res2);
		System.out.println("Sum of square of factors = " + res3);
		System.out.println("Product of factors = " + res4);

		scn.close();
	}
}

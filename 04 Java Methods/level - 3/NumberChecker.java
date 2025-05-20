import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(Math.abs(num));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNum(int num) {
        String numStr = String.valueOf(Math.abs(num));
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    public static boolean isArmNum(int num) {
        int[] digits = getDigitsArray(num);
        int sum = 0, power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static int[] findLarge(int[] digits) {
        int large = Integer.MIN_VALUE, secLarge = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > large) {
                secLarge = large;
                large = digit;
            } else if (digit > secLarge && digit != large) {
                secLarge = digit;
            }
        }
        return new int[]{large, secLarge};
    }

    public static int[] findSmall(int[] digits) {
        int small = Integer.MAX_VALUE, secSmall = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < small) {
                secSmall = small;
                small = digit;
            } else if (digit < secSmall && digit != small) {
                secSmall = digit;
            }
        }
        return new int[]{small, secSmall};
    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        
		System.out.print("Enter number = ");
		int num = scn.nextInt();  

        int count = countDigits(num);
        System.out.println("Count of Digits = " + count);

        int[] digitsArray = getDigitsArray(num);
        System.out.println("Digits Array =  " + Arrays.toString(digitsArray));

        System.out.println("Is Duck Number? " + isDuckNum(num));

        System.out.println("Is Armstrong Number? " + isArmNum(num));

        int[] LPair = findLarge(digitsArray);
        System.out.println("Largest Digit = " + LPair[0]);
        System.out.println("Second Largest Digit = " + LPair[1]);

        int[] SPair = findSmall(digitsArray);
        System.out.println("Smallest Digit = " + SPair[0]);
        System.out.println("Second Smallest Digit = " + SPair[1]);
    }
}

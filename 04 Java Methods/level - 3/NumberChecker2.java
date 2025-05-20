import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker2 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumSqOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarNum(int num) {
        int sum = sumOfDigits(getDigitsArray(num));
        return num % sum == 0;
    }

    public static int[][] digitFreq(int[] digits) {
        int[][] freq = new int[10][2];
        
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a number = ");
        int num = scn.nextInt();
        
        int[] digits = getDigitsArray(num);
        int sum = sumOfDigits(digits);
        int sumSq = sumSqOfDigits(digits);
        boolean isHarshad = isHarNum(num);
        int[][] freq = digitFreq(digits);
        
        System.out.println("Digits Array = " + Arrays.toString(digits));
        System.out.println("Count of Digits = " + countDigits(num));
        System.out.println("Sum of Digits = " + sum);
        System.out.println("Sum of Squares of Digits = " + sumSq);
        System.out.println("Is Harshad Number? " + (isHarshad ? "Yes" : "No"));
        
        System.out.println("\nDigit Frequency: ");
        for (int[] f : freq) {
            if (f[1] > 0) {
                System.out.println("Digit " + f[0] + " appears " + f[1] + " times");
            }
        }
        
        scn.close();
    }
}

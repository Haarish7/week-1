import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {
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

    public static int[] revArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEq(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversedDigits = revArray(digits);
        return arraysEq(digits, reversedDigits);
    }

    public static boolean isDuckNum(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a number = ");
        int num = scn.nextInt();
        
        int[] digits = getDigitsArray(num);
        int[] reversedDigits = revArray(digits);
        
        boolean palindrome = isPalindrome(num);
        boolean duckNum = isDuckNum(num);

        System.out.println("Digits Array = " + Arrays.toString(digits));
        System.out.println("Reversed Digits Array = " + Arrays.toString(reversedDigits));
        System.out.println("Is Palindrome? " + (palindrome ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (duckNum ? "Yes" : "No"));

        scn.close();
    }
}

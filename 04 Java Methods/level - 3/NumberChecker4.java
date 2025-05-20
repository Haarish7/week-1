import java.util.Scanner;

public class NumberChecker4 {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a number = ");
        int num = scn.nextInt();
        
        System.out.println("Is Prime? " + (isPrime(num) ? "Yes" : "No"));
        System.out.println("Is Neon Number? " + (isNeon(num) ? "Yes" : "No"));
        System.out.println("Is Spy Number? " + (isSpy(num) ? "Yes" : "No"));
        System.out.println("Is Automorphic Number? " + (isAutomorphic(num) ? "Yes" : "No"));
        System.out.println("Is Buzz Number? " + (isBuzz(num) ? "Yes" : "No"));

        scn.close();
    }
}

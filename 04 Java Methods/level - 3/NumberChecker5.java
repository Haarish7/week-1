import java.util.ArrayList;
import java.util.Scanner;

public class NumberChecker5 {    
    public static int[] findFact(int num) {
        ArrayList<Integer> factList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factList.add(i);
            }
        }
        return factList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static int findGreatFact(int num) {
        int[] factors = findFact(num);
        return factors[factors.length - 2];
    }
    
    public static int sumOfFact(int num) {
        int sum = 0;
        for (int factor : findFact(num)) {
            sum += factor;
        }
        return sum;
    }
    
    public static int prodOfFact(int num) {
        int prod = 1;
        for (int factor : findFact(num)) {
            prod *= factor;
        }
        return prod;
    }
    
    public static double prodOfCubeFact(int num) {
        double prod = 1;
        for (int factor : findFact(num)) {
            prod *= Math.pow(factor, 3);
        }
        return prod;
    }
    
    public static boolean isPerNum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    
    public static boolean isAbunNum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }
    
    public static boolean isDefNum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }
    
    public static boolean isStNum(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
    
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a number = ");
        int num = scn.nextInt();
        
        System.out.println("Factors = " + java.util.Arrays.toString(findFact(num)));
        System.out.println("Greatest Factor = " + findGreatFact(num));
        System.out.println("Sum of Factors = " + sumOfFact(num));
        System.out.println("Product of Factors = " + prodOfFact(num));
        System.out.println("Product of Cube of Factors = " + prodOfCubeFact(num));
        System.out.println("Is Perfect Number? " + isPerNum(num));
        System.out.println("Is Abundant Number? " + isAbunNum(num));
        System.out.println("Is Deficient Number? " + isDefNum(num));
        System.out.println("Is Strong Number? " + isStNum(num));
		
		scn.close();
    }
}

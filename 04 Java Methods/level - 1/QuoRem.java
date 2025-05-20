import java.util.Scanner;

public class QuoRem {
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quo = number / divisor;
		int rem = number % divisor;
		
		return new int[]{quo, rem};
	}
	
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		QuoRem quoRem = new QuoRem();
		
		System.out.print("Enter number = ");
		int number = scn.nextInt();
		
		System.out.print("Enter divisor = ");
		int divisor = scn.nextInt();
		
		if (divisor == 0) {
            System.out.println("Invalid input");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("The Quotient is " + result[0] + " and the Remainder is " + result[1] + " for numbers " + number + " and " + divisor);
        }
		
		scn.close();
	}
}

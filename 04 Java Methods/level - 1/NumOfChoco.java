import java.util.Scanner;

public class NumOfChoco {
	public static int[] numOfChocolates(int number, int divisor) {
		int numOfChocoChildGets = number / divisor;
		int remainingChoco = number % divisor;
		
		return new int[]{numOfChocoChildGets, remainingChoco};
	}
	
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		NumOfChoco choco = new NumOfChoco();
		
		System.out.print("Enter number of chocolates = ");
		int number = scn.nextInt();
		
		System.out.print("Enter number of children = ");
		int divisor = scn.nextInt();
		
		if (divisor == 0) {
            System.out.println("Invalid input");
        } else {
            int[] result = numOfChocolates(number, divisor);

            System.out.println("The number of chocolate each child gets is " + result[0]);
			System.out.println("The remaining number of chocolate is " + result[1]);
        }
		
		scn.close();
	}
}

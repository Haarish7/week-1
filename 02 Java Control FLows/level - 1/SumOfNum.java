import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		double num = scn.nextDouble();
		
		double sum = 0;
		
		while (num != 0){
			sum += num;
			System.out.println("Sum = " + sum);
			System.out.print("Enter another number = ");
			num = scn.nextDouble();
		}
		
		scn.close();
	}
}

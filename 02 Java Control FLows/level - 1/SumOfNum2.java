import java.util.Scanner;

public class SumOfNum2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		double sum = 0;
		
		boolean loop = true;
		
		while (loop){
			System.out.print("Enter number = ");
			double num = scn.nextDouble();
			
			if (num > 0){
				sum += num;
				System.out.println("Sum = " + sum);
			} else {
				break;
			}
		}
		
		scn.close();
	}
}

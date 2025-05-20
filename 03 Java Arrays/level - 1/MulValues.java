import java.util.Scanner;

public class MulValues {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double[] number = new double[10];
		double total = 0.0;
		int index = 0;
		
		System.out.println("Enter upto 10 nums (0 or negative to stop): ");

		
		while (true) {
			System.out.print("Enter num = ");
			double num = scn.nextDouble();
			
			if (num <= 0) {
				break;
			}
			
			number[index] = num;
			index++;
			
			if (index == 10) {
				break;
			}
		}
		
		System.out.print("Nums entered = ");
		for (int i = 0; i < index; i++) {
			System.out.print(number[i] + " ");
			total += number[i];
		}
		
		System.out.println("\n");		
		System.out.println("Total = " + total);		
		
		scn.close();		
	}
}

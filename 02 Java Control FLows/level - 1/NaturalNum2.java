import java.util.Scanner;

public class NaturalNum2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		int sum = 0;
		
		if (num > 0){
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
		} else {
			System.out.println("Not natural number");
		}
		
		int sum2 = (num * (num + 1)) / 2;
		
		System.out.println("For loop sum = " + sum);
		System.out.println("Formula sum = " + sum2);
		
		scn.close();
	}
}


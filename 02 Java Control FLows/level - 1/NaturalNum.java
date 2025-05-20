import java.util.Scanner;

public class NaturalNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		int sum = 0, i = 1;
		
		if (num > 0){
			while (i <= num) {
				sum += i;
				i += 1;
			}
		} else {
			System.out.println("Not natural number");
		}
		
		int sum2 = (num * (num + 1)) / 2;
		
		System.out.println("While loop sum = " + sum);
		System.out.println("Formula sum = " + sum2);
		
		scn.close();
	}
}

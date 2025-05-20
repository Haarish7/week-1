import java.util.Scanner;

public class Divisible5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		if (num % 5 == 0) {
			System.out.println("Is the number " + num + " divisible by 5? " + true);
		} else {
			System.out.println("Is the number " + num + " divisible by 5? " + false);
		}
		
		scn.close();
	}
}

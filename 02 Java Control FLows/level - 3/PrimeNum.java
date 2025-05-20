import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		boolean is_prime = false;
		
		if (num <= 1){
			is_prime = true;
		}
			
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				is_prime = true;
				break;
			}
		}
		
		if (!is_prime) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not prime number");
		}
				
		scn.close();
	}
}

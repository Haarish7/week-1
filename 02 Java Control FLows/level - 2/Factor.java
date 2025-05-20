import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		if (num > 0){
			for (int i = 1; i <= num; i++) {
				if (num % i == 0){
					System.out.print(i + " ");
				} else {
					continue;
				}
			}
		} else {
			System.out.println("Not natural number");
		}
		
		scn.close();
	}
}

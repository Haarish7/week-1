import java.util.Scanner;

public class Factor2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		int i = 1;
		
		if (num > 0){
			while (i <= num) {
				if (num % i == 0){
					System.out.print(i + " ");
					i += 1;
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

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		
		if (num > 0 && num < 100){
			for (int i = num; i < 100; i++) {
				if (i % num == 0){
					System.out.println(i);
					continue;
				} 
			}
		} else {
			System.out.println("Not natural number or is above 100");
		}
		
		
		scn.close();
	}
}

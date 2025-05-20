import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		if (num > 0){
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0){
					System.out.println(i + " is even num");
				} else {
					System.out.println(i + " is odd num");
				}
			}
		} else {
			System.out.println("Not natural number");
		}
		
		scn.close();
	}
}

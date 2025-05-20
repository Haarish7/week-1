import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		if (num > 0){
			for (int i = 1; i <= num; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
				} else if (i % 3 == 0){
					System.out.println("Fizz");
				} else if (i % 5 == 0){
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Not natural number");
		}
		
		scn.close();
	}
}

import java.util.Scanner;

public class FizzBuzz2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		int i = 1;
		
		if (num > 0){
			while (i <= num) {
				if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
				} else if (i % 3 == 0){
					System.out.println("Fizz");
				} else if (i % 5 == 0){
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
				i += 1;
			}
		} else {
			System.out.println("Not natural number");
		}
		
		scn.close();
	}
}

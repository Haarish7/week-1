import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		String[] fizzbuzz = new String[num];
		
		if (num > 0){
			for (int i = 1; i <= num; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
                    fizzbuzz[i - 1] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    fizzbuzz[i - 1] = "Fizz";
                } else if (i % 5 == 0) {
                    fizzbuzz[i - 1] = "Buzz";
                } else {
                    fizzbuzz[i - 1] = Integer.toString(i);
				}
			}

            for (int i = 0; i < fizzbuzz.length; i++) {
                System.out.println("Position " + (i + 1) + " = " + fizzbuzz[i]);
            }
		} else {
			System.out.println("Not natural number");
		}
		
		scn.close();
	}
}

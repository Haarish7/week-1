import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter age = ");
		int age = scn.nextInt();
		
		if (age >= 18) {
			System.out.println("The person's age is " + age + " and can vote.");
		} else {
			System.out.println("The person's age is " + age + " and cannot vote.");
		}
		
		scn.close();
	}
}

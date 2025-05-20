import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int [] age = new int[10];
		
		System.out.print("Enter age of 10 students = ");
		for (int i = 0 ; i < 10; i++) {
			age[i] = scn.nextInt();
		}
		
		for (int i = 0; i < age.length; i++) {
			if (age[i] < 0) {
				System.out.println("Invalid age = " + age[i]);
			} else if (age[i] >= 18) {
			System.out.println("The person's age is " + age[i] + " and can vote.");
			} else {
			System.out.println("The person's age is " + age[i] + " and cannot vote.");
			}
		}
		
		scn.close();		
	}
}

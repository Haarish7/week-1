import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter salary = ");
		int salary = scn.nextInt();
		
		System.out.print("Enter year of service = ");
		int year = scn.nextInt();
		
		if (year > 5){
			double bonus = 0.05 * (double) salary;
			System.out.println("Bonus = " + bonus);
		} else {
			System.out.println("No bonus");
		}
		
		scn.close();
	}
}

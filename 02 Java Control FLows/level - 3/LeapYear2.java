import java.util.Scanner;

public class LeapYear2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter year = ");
		int year = scn.nextInt();
		
		if (year >= 1582 && year % 4 == 0 || year % 400 == 0){
			System.out.println("Leap year");
		} else {
			System.out.println("Not leap year");
		}
		scn.close();
	}
}

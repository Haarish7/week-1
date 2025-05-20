import java.util.Scanner;

public class LeapYear {
	public static boolean leapYear (int year) { 
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter year = ");
		int year = scn.nextInt();
		
		if (year < 1582) {
            System.out.println("Invalid");
        } else {
            if (leapYear(year)) {
                System.out.println("Leap Year");
            } else {
                System.out.println("NOT Leap Year");
            }
        }
		
		scn.close();
	}
}

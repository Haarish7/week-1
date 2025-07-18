import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter month in number (1-12) = ");
		int m = scn.nextInt();
		
		System.out.print("Enter day of the month = ");
		int d = scn.nextInt();
		
		System.out.print("Enter year = ");
		int y = scn.nextInt();
		
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		
		System.out.println("Day of the week (0 - Sunday, 1 - Monday, ..., 6 - Saturday) = " + d0);
		
		scn.close();
	}
}

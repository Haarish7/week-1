import java.util.Scanner;

public class SpringSeason {
	public int springSeason(int month, int day) {
		if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
		}
		return 0;
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		SpringSeason season = new SpringSeason();
		
		System.out.print("Enter date = ");
		int day = scn.nextInt();
		
		System.out.print("Enter month in digits = ");
		int month = scn.nextInt();
		
		int res = season.springSeason(month, day);
		
		scn.close();
	}
}

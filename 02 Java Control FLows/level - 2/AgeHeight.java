import java.util.Scanner;

public class AgeHeight {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Amar's age = ");
		int AmarAge = scn.nextInt();
		
		System.out.print("Enter Amar's height = ");
		int AmarHeight = scn.nextInt();
		
		System.out.print("Enter Akbar's age = ");
		int AkbarAge = scn.nextInt();
		
		System.out.print("Enter Akbar's height = ");
		int AkbarHeight = scn.nextInt();
		
		System.out.print("Enter Anthony's age = ");
		int AnthonyAge = scn.nextInt();
		
		System.out.print("Enter Anthony's height = ");
		int AnthonyHeight = scn.nextInt();
		
		if (AmarAge < AkbarAge && AmarAge < AnthonyAge){
			System.out.println("Amar is youngest");
		} else if (AkbarAge < AmarAge && AkbarAge < AnthonyAge) {
			System.out.println("Akbar is youngest");
		} else {
			System.out.println("Anthony is youngest");
		}
		
		if (AmarHeight > AkbarHeight && AmarHeight > AnthonyHeight) {
			System.out.println("Amar is tallest");
		} else if (AkbarHeight > AmarHeight && AkbarHeight > AnthonyHeight) {
			System.out.println("Akbar is tallest");
		} else {
			System.out.println("Anthony is tallest");
		}

		scn.close();
	}
}


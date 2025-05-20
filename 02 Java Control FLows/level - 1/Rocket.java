import java.util.Scanner;

public class Rocket {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number for countdown = ");
		int num = scn.nextInt();
		
		while (num > 0){
			System.out.println(num);
			num -= 1;
		}
		
		scn.close();
	}
}

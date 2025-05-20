import java.util.Scanner;

public class Rocket2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number for countdown = ");
		int num = scn.nextInt();
		
		for (int i = num; i > 0; i--){
			System.out.println(i);
		}
		
		scn.close();
	}
}
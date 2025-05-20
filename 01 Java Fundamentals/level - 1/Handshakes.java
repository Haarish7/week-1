import java.util.Scanner;

public class Handshakes {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number of students = ");
		int num = scn.nextInt();
		
		int handshakes = (num * (num - 1)) / 2;
		
		System.out.println("Number of handshakes is " + handshakes);
		
		scn.close();
	}
}

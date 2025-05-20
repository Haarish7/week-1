import java.util.Scanner;

public class Handshakes {
	public int numOfHandshakes(int num) {
		int hs = (num * (num - 1)) / 2;
		return hs;
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		Handshakes handshakes = new Handshakes();
		
		System.out.print("Enter num of students = ");
		int num = scn.nextInt();
		
		int res = handshakes.numOfHandshakes(num);
		
		System.out.println("Total num of handshakes = " + res);
		
		scn.close();
	}
}

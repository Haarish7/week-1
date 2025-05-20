import java.util.Scanner;

public class Athlete {
	public int numOfRounds(int side1, int side2, int side3) {
		int perimeter = side1 + side2 + side3;
		int rounds = perimeter / 5000;
		return rounds;
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		Athlete rounds = new Athlete();
		
		System.out.print("Enter side1 of the triangle = ");
		int side1 = scn.nextInt();
	
		System.out.print("Enter side2 of the triangle = ");
		int side2 = scn.nextInt();
	
		System.out.print("Enter side3 of the triangle = ");
		int side3 = scn.nextInt();
		
		int res = rounds.numOfRounds(side1, side2, side3);
		
		System.out.println("Total num of rounds = " + res);
		
		scn.close();
	}
}

import java.util.Scanner;

public class MulTable {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
	for (int i = 6; i <= 9; i++) {
		System.out.println(num + " * " + i + " = " + (num * i));
	}
		
		scn.close();
	}
}

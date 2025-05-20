import java.util.Scanner;

public class MulTable69 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] table = new int[4];
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		for (int i = 6; i <= 9; i++) {
			int mul = num * i;
			table[i - i] = mul;
			System.out.println(i + " * " + num + " = " + table[i - i]);
		}
		
		scn.close();		
	}
}

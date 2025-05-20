import java.util.Scanner;

public class MulTable {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] table = new int[10];
		
		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		for (int i = 1; i <= table.length; i++) {
			int mul = num * i;
			table[i - 1] = mul;
			System.out.println(i + " * " + num + " = " + table[i - 1]);
		}
		
		scn.close();		
	}
}

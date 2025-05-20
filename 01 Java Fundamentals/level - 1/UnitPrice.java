import java.util.Scanner;

public class UnitPrice {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter unit price per item = ");
		int unitPrice = scn.nextInt();
		
		System.out.print("Enter quantity = ");
		int quantity = scn.nextInt();
	
		int total = unitPrice * quantity;
		
		System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
		
		scn.close();
	}
}

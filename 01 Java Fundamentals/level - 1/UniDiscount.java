import java.util.Scanner;

public class UniDiscount {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter fee = ");
		double fee = scn.nextDouble();
		
		System.out.print("Enter disocunt percentage = ");
		double discountPer = scn.nextDouble();
	
		double discount = fee * discountPer / 100;
		double discountAmt = fee - discount;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountAmt);
		
		scn.close();
	}
}

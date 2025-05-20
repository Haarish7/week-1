public class Fee {
	public static void main (String[] args) {
		float fee = 125000;
		float discountPercen = 10;
		
		float discount = 125000 * 10 / 100;
		float discountAmt = 125000 - discount;		
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountAmt);
	}
}

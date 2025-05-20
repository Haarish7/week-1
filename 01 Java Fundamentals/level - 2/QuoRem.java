import java.util.Scanner;

public class QuoRem{
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter 1st num = ");
	int a = scn.nextInt();
	
	System.out.print("Enter 2nd num = ");
	int b = scn.nextInt();
	
    System.out.println("The Quotient is " + (a / b) + " and Reminder is " + (a % b) + " of two number " + a + " and " + b);
	
	scn.close();
  }
}

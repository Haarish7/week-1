import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter 1st num = ");
	int a = scn.nextInt();
	
	System.out.print("Enter 2nd num = ");
	int b = scn.nextInt();
	
	int temp = 0;

	temp = a;
	a = b; 
	b = temp;
	
    System.out.println("The swapped numbers are " + a + " and " + b);
	
	scn.close();
  }
}

import java.util.Scanner;

public class DoubleABC{
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter 1st num = ");
	double a = scn.nextDouble();
	
	System.out.print("Enter 2nd num = ");
	double b = scn.nextDouble();
	
	System.out.print("Enter 3rd num = ");
	double c = scn.nextDouble();
	
	double w = a + b * c, x = a * b + c, y = c + a / b, z = a % b + c;
	
    System.out.println("The result are \n" + w + "\n" + x + "\n" + y + "\n" + z);
	
	scn.close();
  }
}

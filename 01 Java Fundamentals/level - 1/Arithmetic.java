import java.util.Scanner;

public class Arithmetic{
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter 1st num = ");
	int a = scn.nextInt();
	
	System.out.print("Enter 2nd num = ");
	int b = scn.nextInt();
	
    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + a + " and " + b + " is " + (a + b) + ", " + (a - b) + ", " + (a * b) + " and " + (a / b));
	
	scn.close();
  }
}

import java.util.Scanner;

public class ABC{
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter 1st num = ");
	int a = scn.nextInt();
	
	System.out.print("Enter 2nd num = ");
	int b = scn.nextInt();
	
	System.out.print("Enter 3rd num = ");
	int c = scn.nextInt();
	
	int w = a + b * c;
	int x = a * b + c;
	int y = c + a / b;
	int z = a % b + c;
	
    System.out.println("The result are \n" + w + "\n" + x + "\n" + y + "\n" + z);
	
	scn.close();
  }
}

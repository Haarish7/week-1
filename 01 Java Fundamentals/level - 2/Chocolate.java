import java.util.Scanner;

public class Chocolate {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter number of chocolates = ");
	int chocolate = scn.nextInt();
	
	System.out.print("Enter number of children = ");
	int children = scn.nextInt();
	
	int eachChild = chocolate / children;
	
	int remChoco = chocolate % children;
	
    System.out.println("The number of chocolates each child gets is " + eachChild + " and the number of remaining chocolates are " + remChoco);
	
	scn.close();
  }
}

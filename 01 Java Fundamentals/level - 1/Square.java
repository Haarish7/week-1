import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter side of square = ");
	int side = scn.nextInt();
	
	int perimeter = side * 4;
	
    System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	
	scn.close();
  }
}

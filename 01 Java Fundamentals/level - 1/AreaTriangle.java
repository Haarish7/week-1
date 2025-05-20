import java.util.Scanner;

public class AreaTriangle {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter base in cms = ");
	double base = scn.nextDouble();
	
	System.out.print("Enter height in cms = ");
	double height = scn.nextDouble();
	
	double area = 0.5 * base * height;
	double inch = area / 2.54; 
	
    System.out.println("Area of triangle in cm is " + area + " while in inches is " + inch);
	
	scn.close();
  }
}

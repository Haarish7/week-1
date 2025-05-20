import java.util.Scanner;

public class Athlete {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter side1 of the triangle = ");
	int side1 = scn.nextInt();
	
	System.out.print("Enter side2 of the triangle = ");
	int side2 = scn.nextInt();
	
	System.out.print("Enter side3 of the triangle = ");
	int side3 = scn.nextInt();
	
	int perimeter = side1 + side2 + side3;
	
	int rounds = perimeter / 5;
	
    System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
	
	scn.close();
  }
}

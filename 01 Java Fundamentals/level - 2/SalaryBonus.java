import java.util.Scanner;

public class SalaryBonus{
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter salary = ");
	int salary = scn.nextInt();
	
	System.out.print("Enter bonus = ");
	int bonus = scn.nextInt();
	
	int total = salary + bonus;
	
    System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + total);
	
	scn.close();
  }
}

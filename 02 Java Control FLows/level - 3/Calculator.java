import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter 1st num = ");
		int num1 = scn.nextInt();
		
		System.out.print("Enter 2nd num = ");
		int num2 = scn.nextInt();
		
		System.out.print("Enter operator = ");
		String op = scn.next();
		
		switch (op) {
			case "+":
				System.out.println("Addition = " + (num1 + num2));
				break;
			case "-":
				System.out.println("Subtraction = " + (num1 - num2));
				break;
			case "*":
				System.out.println("Multiplication = " + (num1 * num2));
				break;
			case "/":
				if (num2 != 0) {
                    System.out.println("Division = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                } 
				break;
			default:
				System.out.println("Invalid operator");
		}
		
		scn.close();
	}
}

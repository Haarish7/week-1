import java.util.Scanner;

public class TemperatureConversion{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Celsius: ");
		float celsius = scn.nextFloat();
		
		float fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");
		
		scn.close();
	}
}

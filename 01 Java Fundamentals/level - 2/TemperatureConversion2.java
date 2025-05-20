import java.util.Scanner;

public class TemperatureConversion2{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Farenheit: ");
		float fahrenheit = scn.nextFloat();
		
		float celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius");
		
		scn.close();
	}
}

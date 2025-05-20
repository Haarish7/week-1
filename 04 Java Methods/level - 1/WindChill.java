import java.util.Scanner;

public class WindChill {
	public double calculateWindChill(double temperature, double windSpeed) {
		double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16);
		
		return windChill;
	}
	
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		WindChill chill = new WindChill();
		
		System.out.print("Enter temperature = ");
		double temperature = scn.nextDouble();
		
		System.out.print("Enter wind speed = ");
		double windSpeed = scn.nextInt();
		
		double res = chill.calculateWindChill(temperature, windSpeed);
		System.out.println("Wind chill = " + res);
		
		scn.close();
	}
}

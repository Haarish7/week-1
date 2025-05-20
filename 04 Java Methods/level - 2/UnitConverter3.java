import java.util.Scanner;

public class UnitConverter3 {
    private static final double POUND_TO_KGS = 0.453592;
    private static final double KGS_TO_POUND = 2.20462;
    private static final double GALLONS_TO_LITRES = 3.78541;
    private static final double LITRES_TO_GALLONS = 0.264172;

    public static double convertFahrenheitToCelsius(double fahrenheit) { 
		double farhenheit2celsius = (fahrenheit - 32) * 5 / 9;
		return farhenheit2celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
    }

    public static double convertPoundToKgs(double pound) {
        return pound * POUND_TO_KGS;
    }

    public static double convertKgsToPound(double kgs) {
        return kgs * KGS_TO_POUND;
    }
	
	public static double convertGallonsToLitres(double gallons) {
        return gallons * GALLONS_TO_LITRES;
    }
	
	public static double convertLitresToGallons(double litres) {
        return litres * LITRES_TO_GALLONS;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Convert Pound to Kgs");
            System.out.println("4. Convert Kgs to Pound");
			System.out.println("5. Convert Gallons to Litres");
			System.out.println("6. Convert Litres to Gallons");
            System.out.println("7. Exit");
            System.out.print("Choose an option = ");
            
            int choice = scn.nextInt();
			
			if (choice == 7) {
				System.out.println("Exit");
				break;
			}
			
            System.out.print("Enter value = ");
            double value = scn.nextDouble();
            double res = 0;

            switch (choice) {
				case 1:
                    res = convertFahrenheitToCelsius(value);
                    System.out.println(value + " fahrenheit = " + res + " celsius");
                    break;
				case 2:
                    res = convertCelsiusToFahrenheit(value);
                    System.out.println(value + " celsius = " + res + " fahrenheit");
                    break;
                case 3:
                    res = convertPoundToKgs(value);
                    System.out.println(value + " pound = " + res + " kgs");
                    break;
                case 4:
                    res = convertKgsToPound(value);
                    System.out.println(value + " kgs = " + res + " pound");
                    break;
                case 5:
                    res = convertGallonsToLitres(value);
                    System.out.println(value + " gallons = " + res + " litres");
                    break;
                case 6:
                    res = convertLitresToGallons(value);
                    System.out.println(value + " litres = " + res + " gallons");
                    break;
                default:
                    System.out.println("Invalid input");
            }
		}
    }
}

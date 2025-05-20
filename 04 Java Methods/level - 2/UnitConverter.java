import java.util.Scanner;

public class UnitConverter {
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("1. Convert Kms to Miles");
            System.out.println("2. Convert Miles to Kms");
            System.out.println("3. Convert Meters to Feet");
            System.out.println("4. Convert Feet to Meters");
            System.out.println("5. Exit");
            System.out.print("Choose an option = ");
            
            int choice = scn.nextInt();
			
			if (choice == 5) {
				System.out.println("Exit");
				break;
			}
			
            System.out.print("Enter value = ");
            double value = scn.nextDouble();
            double res = 0;

            switch (choice) {
                case 1:
                    res = convertKmToMiles(value);
                    System.out.println(value + " km = " + res + " miles");
                    break;
                case 2:
                    res = convertMilesToKm(value);
                    System.out.println(value + " miles = " + res + " km");
                    break;
                case 3:
                    res = convertMetersToFeet(value);
                    System.out.println(value + " meters = " + res + " feet");
                    break;
                case 4:
                    res = convertFeetToMeters(value);
                    System.out.println(value + " feet = " + res + " meters");
                    break;
                default:
                    System.out.println("Invalid input");
            }
		}
    }
}

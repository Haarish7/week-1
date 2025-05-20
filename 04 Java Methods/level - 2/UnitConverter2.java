import java.util.Scanner;

public class UnitConverter2 {
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
	private static final double INCHES_TO_CMS = 2.54;

    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }
	
	public static double convertInchesToCms(double inches) {
        return inches * INCHES_TO_CMS;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("1. Convert Yards to Feet");
            System.out.println("2. Convert Feet to Yards");
            System.out.println("3. Convert Meters to Inches");
            System.out.println("4. Convert Inches to Meters");
            System.out.println("5. Convert Inches to Cms");
			System.out.println("6. Exit");
            System.out.print("Choose an option = ");
            
            int choice = scn.nextInt();
			
			if (choice == 6) {
				System.out.println("Exit");
				break;
			}
			
            System.out.print("Enter value = ");
            double value = scn.nextDouble();
            double res = 0;

            switch (choice) {
                case 1:
                    res = convertYardsToFeet(value);
                    System.out.println(value + " yards = " + res + " feet");
                    break;
                case 2:
                    res = convertFeetToYards(value);
                    System.out.println(value + " feet = " + res + " yards");
                    break;
                case 3:
                    res = convertMetersToInches(value);
                    System.out.println(value + " meters = " + res + " inches");
                    break;
                case 4:
                    res = convertInchesToMeters(value);
                    System.out.println(value + " inches = " + res + " meters");
                    break;
				case 5:
                    res = convertInchesToCms(value);
                    System.out.println(value + " inches = " + res + " cms");
                    break;					
                default:
                    System.out.println("Invalid input");
            }
		}
    }
}

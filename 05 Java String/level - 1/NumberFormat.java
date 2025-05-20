import java.util.Scanner;

public class NumberFormat {
    public static void genExp(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Converted num = " + num);
    }

    public static void handleExp(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted num = " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException = Invalid input '" + text + "' is not valid integer");
        } catch (Exception e) {
            System.out.println("Caught generic Exception = " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num = ");
        String str = scn.nextLine();

        System.out.println("\nDemonstrating NumberFormatException = ");
        try {
            genExp(str);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException() = " + e.getMessage());
        }

        System.out.println("\nHandling NumberFormatException safely = ");
        handleExp(str);

        scn.close();
    }
}
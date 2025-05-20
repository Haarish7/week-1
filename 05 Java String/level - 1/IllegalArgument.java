import java.util.Scanner;

public class IllegalArgument {
    public static void genExp(String text) {
        if (text.length() < 5) {
            throw new IllegalArgumentException("Input string must be at least 5 characters long.");
        }
        throw new IllegalArgumentException("This is a manually thrown IllegalArgumentException.");
    }

    public static void handleExp(String text) {
        try {
            genExp(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException = " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught generic Exception = " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string = ");
        String str = sc.nextLine();

        System.out.println("\nDemonstrating IllegalArgumentException = ");
        try {
            genExp(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException() = " + e.getMessage());
        }

        System.out.println("\nHandling IllegalArgumentException safely = ");
        handleExp(str);

        sc.close();
    }
}

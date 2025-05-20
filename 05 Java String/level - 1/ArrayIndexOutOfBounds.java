import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void genExp(String[] names, int index) {
        System.out.println("Accessing index " + index + " = " + names[index]);
    }

    public static void handleExp(String[] names, int index) {
        try {
            System.out.println("Accessing index " + index + " = " + names[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException = Index " + index + " is out of bounds");
        } catch(Exception e) {
            System.out.println("Caught generic Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Sample array of names
        String[] names = {"Ruchi", "ABC", "XYZ"};

        System.out.println("Available names = ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + " = " + names[i]);
        }

        System.out.print("\nEnter index to access = ");
        int index = scn.nextInt();

        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException = ");
        try {
            genExp(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException() = " + e.getMessage());
        }

        System.out.println("\nHandling ArrayIndexOutOfBoundsException safely = ");
        handleExp(names, index);

        scn.close();
    }
}
import java.util.Scanner;

public class StringIndex {
    public static void genExp(String text) {
        System.out.println("Accessing character at position " + text.length());
        System.out.println("Character = " + text.charAt(text.length()));
    }

    public static void handleExp(String text) {
        try {
            System.out.println("Accessing character at position " + text.length());
            System.out.println("Character = " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException = " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string = ");
        String str = sc.nextLine();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException = ");
        try {
            genExp(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException() = " + e.getMessage());
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException safely = ");
        handleExp(str);

        sc.close();
    }
}

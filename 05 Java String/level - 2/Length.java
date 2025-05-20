import java.util.Scanner;

public class Length {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String input = scn.next();

        int manual = findLength(input);

        int builtIn = input.length();

        System.out.println("\nOriginal String = " + input);
        System.out.println("Length (Manual) = " + manual);
        System.out.println("Length (Built-in) = " + builtIn);

        scn.close();
    }
}

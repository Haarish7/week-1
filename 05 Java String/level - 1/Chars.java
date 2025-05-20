import java.util.Scanner;

public class Chars {
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean comArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String input = scn.next();

        char[] chars1 = getChars(input);

        char[] chars2 = input.toCharArray();

        boolean areEqual = comArrays(chars1, chars2);

        System.out.print("Characters using user-defined method = ");
        for (char c : chars1) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using built-in toCharArray() = ");
        for (char c : chars2) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both results the same? " + areEqual);

        scn.close();
    }
}

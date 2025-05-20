import java.util.Scanner;

public class Substring {
    public static String subCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean comCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String inputString = scn.next();

        System.out.print("Enter the start index = ");
        int startIndex = scn.nextInt();

        System.out.print("Enter the end index = ");
        int endIndex = scn.nextInt();

        String sub1 = subCharAt(inputString, startIndex, endIndex);

        String sub2 = inputString.substring(startIndex, endIndex);

        boolean areEqual = comCharAt(sub1, sub2);

        System.out.println("\nSubstring using charAt() = " + sub1);
        System.out.println("Substring using built-in method = " + sub2);
        System.out.println("Are both substrings equal? " + areEqual);

        scn.close();
    }
}

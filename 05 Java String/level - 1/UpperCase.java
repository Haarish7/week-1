import java.util.Scanner;

public class UpperCase {
    public static String upperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean comStr(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        String builtIn = str.toUpperCase();

        String manual = upperCase(str);

        boolean isSame = comStr(builtIn, manual);

        System.out.println("\nOriginal String = " + str);
        System.out.println("Uppercase (Manual) = " + manual);
        System.out.println("Uppercase (Built-in) = " + builtIn);
        System.out.println("Are both conversions the same? " + isSame);

        sc.close();
    }
}

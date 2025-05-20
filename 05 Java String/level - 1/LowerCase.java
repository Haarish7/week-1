import java.util.Scanner;

public class LowerCase {
    public static String lowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
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

        String builtIn = str.toLowerCase();

        String manual = lowerCase(str);

        boolean isSame = comStr(builtIn, manual);

        System.out.println("\nOriginal String = " + str);
        System.out.println("Lowercase (Manual) = " + manual);
        System.out.println("Lowercase (Built-in) = " + builtIn);
        System.out.println("Are both conversions the same? " + isSame);

        sc.close();
    }
}

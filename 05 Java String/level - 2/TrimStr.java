import java.util.Scanner;

public class TrimStr {
    public static int[] findTrimI(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstr(String text, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++) {
            res += text.charAt(i);
        }

        return res;
    }

    public static boolean comStr(String str1, String str2) {
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

        System.out.print("Enter string with spaces = ");
        String str = scn.nextLine();

        int[] indices = findTrimI(str);
        String trimCharAt = createSubstr(str, indices[0], indices[1]);
        String trimBuiltIn = str.trim();

        boolean isSame = comStr(trimCharAt, trimBuiltIn);

        System.out.println("Trimmed by charAt() = '" + trimCharAt + "'");
        System.out.println("Trimmed by trim() = '" + trimBuiltIn + "'");
        System.out.println("Same result? " + isSame);

        scn.close();
    }
}

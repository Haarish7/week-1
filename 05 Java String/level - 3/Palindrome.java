import java.util.Scanner;

public class Palindrome {
    public static boolean isPalinLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalinRecur(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalinRecur(text, start + 1, end - 1);
    }

    public static boolean isPalinChArray(String text) {
        char[] org = text.toCharArray();
        char[] rev = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            rev[i] = text.charAt(text.length() - 1 - i);
        }

        for (int i = 0; i < text.length(); i++) {
            if (org[i] != rev[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter string = ");
        String str = scn.nextLine().toLowerCase().replaceAll("\\s+", "");

        boolean loopRes = isPalinLoop(str);
        boolean recRes = isPalinRecur(str, 0, str.length() - 1);
        boolean chArrayRes = isPalinChArray(str);

        System.out.println("Using loop = " + (loopRes ? "Palindrome" : "Not palindrome"));
        System.out.println("Using recursion = " + (recRes ? "Palindrome" : "Not palindrome"));
        System.out.println("Using character array = " + (chArrayRes ? "Palindrome" : "Not palindrome"));

        scn.close();
    }
}

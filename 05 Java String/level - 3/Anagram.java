import java.util.Scanner;

public class Anagram {
    public static boolean isAnag(String text1, String text2) {
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enetr 1st text = ");
        String text1 = scn.nextLine();

        System.out.print("Enter 2nd text = ");
        String text2 = scn.nextLine();

        boolean res = isAnag(text1, text2);
        System.out.println("Result = " + (res ? "Anagram" : "Not anagram"));

        scn.close();
    }
}

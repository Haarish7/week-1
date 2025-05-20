import java.util.Scanner;

public class NonRepeatingChars {
    public static char findNonReChar(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = scn.nextLine();

        char res = findNonReChar(str);

        if (res != '\0') {
            System.out.println("First non-repeating character = " + res);
        } else {
            System.out.println("No non-repeating character found");
        }

        scn.close();
    }
}

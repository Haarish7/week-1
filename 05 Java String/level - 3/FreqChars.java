import java.util.Scanner;

public class FreqChars {
    public static String[][] chFreq(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int unCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                unCount++;
            }
        }

        String[][] res = new String[unCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                res[index][0] = String.valueOf((char) i);
                res[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return res;
    }

    public static void disChFreq(String[][] res) {
        System.out.println("\nCharacter | Frequency");
        for (String[] row : res) {
            System.out.printf("    %s     |    %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = scn.nextLine();

        String[][] res = chFreq(str);
        disChFreq(res);

        scn.close();
    }
}

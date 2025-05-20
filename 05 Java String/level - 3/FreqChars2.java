import java.util.Scanner;

public class FreqChars2 {
    public static char[] unChars(String text) {
        char[] unCh = new char[text.length()];
        int unCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currCh = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < unCount; j++) {
                if (unCh[j] == currCh) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unCh[unCount] = currCh;
                unCount++;
            }
        }

        char[] finalUnCh = new char[unCount];
        System.arraycopy(unCh, 0, finalUnCh, 0, unCount);
        return finalUnCh;
    }

    public static String[][] findChFreq(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        char[] unCh = unChars(text);

        String[][] result = new String[unCh.length][2];

        for (int i = 0; i < unCh.length; i++) {
            result[i][0] = String.valueOf(unCh[i]);
            result[i][1] = String.valueOf(freq[unCh[i]]);
        }

        return result;
    }

    public static void disChFreq(String[][] result) {
        System.out.println("\nCharacter | Frequency");
        for (String[] row : result) {
            System.out.printf("    %s     |    %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = scn.nextLine();

        String[][] result = findChFreq(str);
        disChFreq(result);

        scn.close();
    }
}

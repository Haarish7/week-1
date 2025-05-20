import java.util.Scanner;

public class FreqChars3 {
    public static String[][] findChFreq(String text) {
        char[] chArray = text.toCharArray();
        int len = chArray.length;
        int[] freq = new int[len];

        for (int i = 0; i < len; i++) {
            if (chArray[i] == '0') continue;
            freq[i] = 1;

            for (int j = i + 1; j < len; j++) {
                if (chArray[i] == chArray[j]) {
                    freq[i]++;
                    chArray[j] = '0';
                }
            }
        }

        int unCount = 0;
        for (int i = 0; i < len; i++) {
            if (chArray[i] != '0') {
                unCount++;
            }
        }

        String[][] res = new String[unCount][2];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (chArray[i] != '0') {
                res[index][0] = String.valueOf(chArray[i]);
                res[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return res;
    }

    public static void disChFreq(String[][] res) {
        System.out.println("Character | Frequency");
        for (String[] row : res) {
            System.out.printf("   %s   |   %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter string = ");
        String str = scn.nextLine();

        String[][] res = findChFreq(str);
        disChFreq(res);

        scn.close();
    }
}

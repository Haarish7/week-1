import java.util.Scanner;

public class VowelsConsonants2 {
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not letter";
        }
    }

    public static int findStrLen(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[][] analyzeChars(String text) {
        int len = findStrLen(text);
        String[][] res = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            res[i][0] = String.valueOf(ch);
            res[i][1] = checkChar(ch);
        }
        return res;
    }

    public static void disTable(String[][] arr) {
        System.out.printf("\n%-10s | %-15s\n", "Character", "Type");
        for (String[] row : arr) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter sentence = ");
        String sent = scn.nextLine();

        String[][] charAnalysis = analyzeChars(sent);

        disTable(charAnalysis);

        scn.close();
    }
}


import java.util.Scanner;

public class VowelsConsonants {
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

    public static int[] countVC(String text) {
        int vCount = 0, cCount = 0;
        int len = findStrLen(text);

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            String type = checkChar(ch);

            if (type.equals("Vowel")) {
                vCount++;
            } else if (type.equals("Consonant")) {
                cCount++;
            }
        }
        return new int[]{vCount, cCount};
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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter sentence = ");
        String sentence = scn.nextLine();

        int[] counts = countVC(sentence);

        System.out.println("Total vowels = " + counts[0]);
        System.out.println("Total consonants = " + counts[1]);

        scn.close();
    }
}

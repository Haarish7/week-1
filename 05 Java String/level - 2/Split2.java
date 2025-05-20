import java.util.ArrayList;
import java.util.Scanner;

public class Split2 {
    public static int findLen(String text) {
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

    public static String[] manual(String text) {
        ArrayList<String> words = new ArrayList<>();
        int len = findLen(text);
        int start = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                if (start != i) {
                    words.add(text.substring(start, i));
                }
                start = i + 1;
            }
        }
        if (start < len) {
            words.add(text.substring(start));
        }

        return words.toArray(new String[0]);
    }

    public static String[][] wordsWithLen(String[] words) {
        String[][] wordLenArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLenArray[i][0] = words[i];
            wordLenArray[i][1] = String.valueOf(findLen(words[i]));
        }
        return wordLenArray;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a sentence = ");
        String input = scn.nextLine();

        String[] words = manual(input);
        String[][] wordsWLen = wordsWithLen(words);

        System.out.println("\nWord\t\tLength");
        for (String[] row : wordsWLen) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }

        scn.close();
    }
}

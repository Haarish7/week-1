import java.util.Scanner;
import java.util.ArrayList;

public class ShortLong {
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

    public static String[] findShortLong(String[][] wordLenArray) {
        String shortest = wordLenArray[0][0];
        String longest = wordLenArray[0][0];

        for (String[] wordData : wordLenArray) {
            if (findLen(wordData[0]) < findLen(shortest)) {
                shortest = wordData[0];
            }
            if (findLen(wordData[0]) > findLen(longest)) {
                longest = wordData[0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter sentence = ");
        String sentence = scn.nextLine();

        String[] words = manual(sentence);
        String[][] wordsWLen = wordsWithLen(words);
        String[] shortLong = findShortLong(wordsWLen);

        System.out.println("\nWord\t\tLength");
        for (String[] row : wordsWLen) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }

        System.out.println("\nShortest word = " + shortLong[0]);
        System.out.println("Longest word = " + shortLong[1]);

        scn.close();
    }
}

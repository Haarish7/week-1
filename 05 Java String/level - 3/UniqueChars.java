import java.util.Scanner;

public class UniqueChars {
    public static int strLen(String text) {
        int count = 0;
        try {
            while (text.charAt(count) != '\0') {
                count++;
            }
        } catch (Exception e) {
            return count;
        }
        return count;
    }

    public static char[] uniqueChars(String text) {
        int length = strLen(text);
        char[] unCh = new char[length];
        int unCount = 0;

        for (int i = 0; i < length; i++) {
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
        for (int k = 0; k < unCount; k++) {
            finalUnCh[k] = unCh[k];
        }

        return finalUnCh;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter string = ");
        String input = scn.nextLine();

        char[] unCh = uniqueChars(input);

        System.out.print("Unique characters = ");
        for (char c : unCh) {
            System.out.print(c + " ");
        }

        scn.close();
    }
}

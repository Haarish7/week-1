import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Split {
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

    public static String[] manualSplit(String text) {
        ArrayList<String> words = new ArrayList<>();
        int len = findLen(text);
        int st = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                if (st != i) {
                    words.add(text.substring(st, i));
                }
                st = i + 1;
            }
        }
        if (st < len) {
            words.add(text.substring(st));
        }

        return words.toArray(new String[0]);
    }

    public static boolean comArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a sentence = ");
        String input = scn.nextLine();

        String[] manual = manualSplit(input);
        String[] builtIn = input.split(" ");

        boolean isEqual = comArrays(manual, builtIn);

        System.out.println("\nOriginal String = " + input);
        System.out.println("Words (Manual) = " + Arrays.toString(manual));
        System.out.println("Words (Built-in) = " + Arrays.toString(builtIn));
        System.out.println("Same result? " + isEqual);

        scn.close();
    }
}

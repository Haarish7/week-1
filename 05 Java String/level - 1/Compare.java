import java.util.Scanner;

public class Compare {
    public static boolean compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter 1st string = ");
        String string1 = scn.next();

        System.out.print("Enter 2nd string = ");
        String string2 = scn.next();

        boolean charAt = compare(string1, string2);

        boolean equals = string1.equals(string2);

        System.out.println("\nComparison using charAt() = " + charAt);
        System.out.println("Comparison using equals() = " + equals);

        if (charAt == equals) {
            System.out.println("Same result");
        } else {
            System.out.println("Different result");
        }

        scn.close();
    }
}

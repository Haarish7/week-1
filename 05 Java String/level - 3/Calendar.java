import java.util.Scanner;

public class Calendar {
    public static final String[] MONTHS = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    public static final int[] DAYS_IN_MON = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYr(int yr) {
        return (yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0);
    }

    public static int getDaysMon(int mon, int yr) {
        if (mon == 2 && isLeapYr(yr)) {
            return 29;
        }
        return DAYS_IN_MON[mon];
    }

    public static int get1stDay(int mon, int yr) {
        int d = 1;
        int y = yr - (14 - mon) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = mon + 12 * ((14 - mon) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7;
    }

    public static void disCal(int mon, int yr) {
        System.out.println(MONTHS[mon] + " " + yr);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = get1stDay(mon, yr);
        int dayMon = getDaysMon(mon, yr);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <=dayMon; day++) {
            System.out.printf("%3d ", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter month (1-12) = ");
        int mon = scn.nextInt();

        System.out.print("Enter year = ");
        int yr = scn.nextInt();

        if (mon < 1 || mon > 12 || yr < 1) {
            System.out.println("invalid input");
        } else {
            disCal(mon, yr);
        }

        scn.close();
    }
}

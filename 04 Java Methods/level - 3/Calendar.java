import java.util.Scanner;

public class Calendar {
    private static final String[] months = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };
    
    private static final int[] dayMon = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDayMon(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return dayMon[month - 1];
    }

    public static int get1stMon(int month, int year) {
        int d = 1;
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int firstDay = (d + x + (31 * m) / 12) % 7;
        return firstDay;
    }

    public static void disCal(int month, int year) {
        int days = getDayMon(month, year);
        int startDay = get1stMon(month, year);
		
        System.out.println("\n  " + months[month - 1] + " " + year);
		System.out.println(isLeapYear(year) ? "(Leap Year)" : "(Not Leap Year)");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12) = ");
        int month = sc.nextInt();
        System.out.print("Enter year = ");
        int year = sc.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input");
        } else {
            disCal(month, year);
        }

        sc.close();
    }
}

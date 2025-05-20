import java.util.Scanner;

public class PosNegOddEven {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
	
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = scn.nextInt();
        }

        for (int num : nums) {
            if (isPositive(num)) {
                System.out.print(num + " is positive and ");
                if (isEven(num)) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } else {
                System.out.println(num + " is negative");
            }
        }

        int res = compare(nums[0], nums[nums.length - 1]);

        System.out.print("\nComparison: ");
        if (res == 1) {
            System.out.println(nums[0] + " is greater than " + nums[nums.length - 1]);
        } else if (res == -1) {
            System.out.println(nums[0] + " is less than " + nums[nums.length - 1]);
        } else {
            System.out.println(nums[0] + " is equal to " + nums[nums.length - 1]);
        }

        scn.close();
    }
}

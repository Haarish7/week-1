import java.util.Scanner;

public class SumNatNum {
	public static int usingRecursion (int num) {
		if (num == 0) {
            return 0;
        }
        return num + usingRecursion(num - 1);
	}

	public static int usingFormula (int num) {
		return (num * (num + 1)) / 2;
	}

	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter num = ");
		int num = scn.nextInt();
		
		if (num <= 0) {
            System.out.println(num + " is not a natural number.");
        } else {
			int res1 = usingRecursion(num);
			int res2 = usingFormula(num);

			System.out.println("Using Recursion = " + res1);
			System.out.println("Using Formula = " + res2);
		
			if (res1 == res2) {
                System.out.println("Both computations are correct");
            } else {
                System.out.println("There is a mismatch in computations");
            }
		}
		
		scn.close();
	}
}

import java.util.Scanner;

public class Vote {
	public static boolean canStudentVote (int age) { 
		if (age < 0) {
			System.out.println("Invalid age");
			return false;
		}
		return age >= 18;
	}

	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] ages = new int[10];
		
		System.out.print("Enter age of 10 students = ");
		for (int i = 0 ; i < 10; i++) {
			ages[i] = scn.nextInt();
		}
		
        for (int i = 0; i < 10; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is NOT eligible to vote.");
            }
        }
		
		scn.close();
	}
}

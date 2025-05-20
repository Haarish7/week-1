import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter physics marks = ");
		int phy = scn.nextInt();
		System.out.print("Enter chemistry marks = ");
		int chem = scn.nextInt();
		System.out.print("Enter maths marks = ");
		int math = scn.nextInt();
		
		double avg = (((double) phy + chem + math) / 300) * 100;
		
		if (avg >= 80) {
			System.out.println("Grade = A");
			System.out.println("Remarks = Level 4, above agency-normalized standards");
			System.out.println("Marks = " + avg);
		} else if (avg >= 70 && avg <= 79) {
			System.out.println("Grade = B");
			System.out.println("Remarks = Level 3, at agency-normalized standards");
			System.out.println("Marks = " + avg);
		} else if (avg >= 60 && avg <= 69) {
			System.out.println("Grade = C");
			System.out.println("Remarks = Level 2, below, but approaching agency-normalized standards");
			System.out.println("Marks = " + avg);
		} else if (avg >= 50 && avg <= 59) {
			System.out.println("Grade = D");
			System.out.println("Remarks = Level 1, well below agency-normalized standards");
			System.out.println("Marks = " + avg);
		} else if (avg >= 40 && avg <= 49) {
			System.out.println("Grade = E");
			System.out.println("Remarks = Level 1- , too below agency-normalized standards");
			System.out.println("Marks = " + avg);
		} else if (avg <= 39) {
			System.out.println("Grade = R");
			System.out.println("Remarks = Remedial standards");
			System.out.println("Marks = " + avg);
		}
		scn.close();
	}
}


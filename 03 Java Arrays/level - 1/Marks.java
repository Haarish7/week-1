import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number of students = ");
		int students = scn.nextInt();
		
		int[][] marks = new int[students][3];
		double[] percen = new double[students];
		String[] grades = new String[students];
		
		for (int i = 0; i < students; i++) {
			System.out.println("Enter marks for student " + (i + 1) + ":");
			
			for (int j = 0; j <3; j++) {
				String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
				
				do {
					System.out.print(subject + " marks = ");
					marks[i][j] = scn.nextInt();
					if (marks[i][j] < 0 || marks[i][j] > 100) {
						System.out.println("Invlaid input");
					}
				} while (marks[i][j] < 0 || marks[i][j] > 100);
			}
			
			percen[i] = ((marks[i][0] + marks[i][1] + marks[i][2]) / 300.0) * 100;
			
			if (percen[i] >= 80) {
                grades[i] = "A (Level 4, above agency-normalized standards)";
            } else if (percen[i] >= 70) {
                grades[i] = "B (Level 3, at agency-normalized standards)";
            } else if (percen[i] >= 60) {
                grades[i] = "C (Level 2, below, but approaching agency-normalized standards)";
            } else if (percen[i] >= 50) {
                grades[i] = "D (Level 1, well below agency-normalized standards)";
            } else if (percen[i] >= 40) {
                grades[i] = "E (Level 1-, too below agency-normalized standards)";
            } else {
                grades[i] = "R (Remedial standards)";
            }
		}
		System.out.println("\nStudent Marks Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-35s%n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        
        for (int i = 0; i < students; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-35s%n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percen[i], grades[i]);
        }

        scn.close();
    }
}

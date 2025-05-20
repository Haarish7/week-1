import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			
		double[] salary = new double[10];
		int[] years = new int[10];
		double[] bonus = new double[10];
		double[] newSalary = new double[10];
		
		double totalBonus = 0;
		double totalSalary = 0;
		double totalNewSalary = 0;
		
	for (int i = 0; i < 10; i++) {
		System.out.println("Enter details of employee " + (i + 1));
		
		while (true) {
			System.out.print("Enter salary = ");
			salary[i] = scn.nextDouble();
			
			System.out.print("Enter years of service = ");
			years[i] = scn.nextInt();
			
			if (salary[i] < 0 || years[i] < 0) {
                    System.out.println("Invalid input!");
                    continue;
			}
			break;
		}
	}
	
	for (int i = 0; i < 10; i++) {
		if (years[i] > 5) {
			bonus[i] = 0.05 * salary[i];
		} else {
			bonus[i] = 0.02 * salary[i];
		}
		newSalary[i] = salary[i] + bonus[i];
		
		totalBonus += bonus[i];
        totalSalary += salary[i];
        totalNewSalary += newSalary[i];
	}
	
	System.out.println("\nBonus details for employees:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary = INR " + salary[i] + ", Bonus = INR " + bonus[i] + ", New Salary = INR " + newSalary[i]);
        }
		
		System.out.println("\nTotal Bonus Payout = INR " + totalBonus);
        System.out.println("Total Old Salary = INR " + totalSalary);
        System.out.println("Total New Salary = INR " + totalNewSalary);

        scn.close();
    }
}

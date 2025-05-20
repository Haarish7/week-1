import java.util.Scanner;

public class AgeHeight {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] names = {"Amar", "Akbar", "Anthony"};
		int[] ages = new int[3];
		int[] heights = new int[3];
		
		for(int i = 0; i <3; i++) {
			System.out.print("Enter " + names[i] + "'s age = ");
			ages[i] = scn.nextInt();
			
			System.out.print("Enter " + names[i] + "'s height = ");
			heights[i] = scn.nextInt();

			if (ages[i] < 0 || heights[0] < 0) {
				System.out.println("Invalid input");
				i--;
			}
		}
		
		int minAge = ages[0], youngestI = 0;
		for (int i = 1; i < 3; i++) {
			if(ages[i] < minAge) {
				minAge = ages[i];
				youngestI = i;
			}
		}
		
		int maxHeight = heights[0], tallestI = 0;
		for (int i = 0; i < 3; i++) {
			if (heights[i] > maxHeight) {
				maxHeight = heights[i];
				tallestI = i;
			}
		}
		
		System.out.println("\nThe youngest friend is = " + names[youngestI] + " (Age = " + minAge + ")");
        System.out.println("The tallest friend is = " + names[tallestI] + " (Height = " + maxHeight + " cm)");

		scn.close();
	}
}


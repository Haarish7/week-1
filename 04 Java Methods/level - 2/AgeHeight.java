import java.util.Scanner;

public class AgeHeight {
    public static int findYoungest(int[] ages) {
        int minAge = ages[0], youngestI = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestI = i;
            }
        }
        return youngestI;
    }

    public static int findTallest(int[] heights) {
        int maxHeight = heights[0], tallestI = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestI = i;
            }
        }
        return tallestI;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = scn.nextInt();

            System.out.print("Enter " + names[i] + "'s height (in cm): ");
            heights[i] = scn.nextInt();

            if (ages[i] < 0 || heights[i] < 0) {
                System.out.println("Invalid input");
                i--; 
            }
        }
		
        int youngestI = findYoungest(ages);
        int tallestI = findTallest(heights);

        System.out.println("\nThe youngest friend is: " + names[youngestI]);
        System.out.println("The tallest friend is: " + names[tallestI]);

        scn.close();
    }
}

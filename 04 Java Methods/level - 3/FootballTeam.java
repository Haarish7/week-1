import java.util.Arrays;
import java.util.Random;

public class FootballTeam {
    public static int[] generateRandomHeight(int size) {
		Random rand = new Random();
		int[] heights = new int[size];
		for (int i = 0; i < size; i++) {
			heights[i] = 150 + rand.nextInt(101);
		}
		return heights;
	}
	
	public static int findSum(int[] heights) {
		int sum = 0;
		for (int height : heights) {
			sum += height;
		}
		return sum;
	}
	
	public static double findMean(int[] heights) {
		return (double) findSum(heights) / heights.length;
	}
	
	public static int findShortest(int[] heights) {
		int min = heights[0];
		for (int height : heights) {
			min = Math.min(min, height);
		}
		return min;
	}
	
	public static int findTallest(int[] heights) {
		int max = heights[0];
		for (int height : heights) {
			max = Math.max(max, height);
		}
		return max;
	}
	

    public static void main(String[] args) {
        int size = 11;
		int[] heights = generateRandomHeight(size);
		
		int sum = findSum(heights);
		double mean = findMean(heights);
		int shortest = findShortest(heights);
		int tallest = findTallest(heights);
		
		System.out.print("Heights = " + Arrays.toString(heights));
		System.out.print("\nSum = " + sum);
		System.out.print("\nMean = " + mean);
		System.out.print("\nShortest = " + shortest);
		System.out.print("\nTallest = " + tallest);		
    }
}

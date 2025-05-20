import java.util.Arrays;

public class RandomValues {
    public static int[] generateRandomArray(int size) {
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = 1000 + (int) (Math.random() * 9000);
		}
		return nums;
	}
	
	public static double[] findAvgMinMax(int[] nums) {
		double sum = 0;
		int min = nums[0];
		int max = nums[0];
		
		for(int num : nums) {
			sum += num;
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		
		double avg = sum / nums.length;
		
		return new double[]{avg, min, max};
	}


    public static void main(String[] args) {		
		int size = 5;
		
		int[] randomNums = generateRandomArray(size);
		
		double[] res = findAvgMinMax(randomNums);
		
		System.out.print("Random numbers = " + Arrays.toString(randomNums));
		System.out.print("\nAverage = " + res[0]);
		System.out.print("\nMinimum number = " + res[1]);
		System.out.print("\nMaximum number = " + res[2]);

    }
}

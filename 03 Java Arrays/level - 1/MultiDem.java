import java.util.Scanner;

public class MultiDem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num of rows = ");
        int row = scn.nextInt();
		
		System.out.print("Enter num of columns = ");
        int column = scn.nextInt();
		
		int[][] d2 = new int[row][column];
		
		int[] d1 = new int[row * column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("Enter num at " + i + " " + j + " = ");
				d2[i][j] = scn.nextInt();
			}
		}
		
		int index = 0;
		
		System.out.println("The 2-d array is =");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				d1[index++] = d2[i][j];
				System.out.print(d2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("The 1-D array is = ");
		for (int i = 0; i < d1.length; i++) {
			System.out.print(d1[i] + " ");
		}
		
        scn.close();
    }
}

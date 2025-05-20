import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a natural number = ");
        int num = scn.nextInt();

        if (num < 1) {
            System.out.println("Error: Enter a natural number greater than 0.");
            return;
        }

        int[] even = new int[num / 2 + 1];
        int[] odd = new int[num / 2 + 1];

        int evenI = 0, oddI = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                even[evenI++] = i;
            } else {
                odd[oddI++] = i;
            }
        }

        System.out.print("Even Numbers = ");
        for (int i = 0; i < evenI; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println(); 

        System.out.print("Odd Numbers = ");
        for (int i = 0; i < oddI; i++) {
            System.out.print(odd[i] + " ");
        }
		
        scn.close();
    }
}

import java.util.Scanner;

public class GreatestFactor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		int greatestFact = 1;
		
		if (num > 0){
			for (int i = num - 1; i >= 1; i--) {
				if (num % i == 0){
					greatestFact = i;
					break;
				} else {
					continue;
				}
			}
			
			System.out.println("Greatest Factor = " + greatestFact);
			
		} else {
			System.out.println("Not natural number");
		}
		
		
		scn.close();
	}
}

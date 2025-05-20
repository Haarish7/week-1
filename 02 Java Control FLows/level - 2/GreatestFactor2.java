import java.util.Scanner;

public class GreatestFactor2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = scn.nextInt();
		
		int greatestFact = 1;
		
		int i = num - 1;
		
		if (num > 0){
			while (i >= 1) {
				if (num % i == 0){
					greatestFact = i;
					i -= 1;
					break;
				} 
				i -= 1;
			}
			
			System.out.println("Greatest Factor = " + greatestFact);
			
		} else {
			System.out.println("Not natural number");
		}
		
		
		scn.close();
	}
}

public class Earth {
	public static void main (String[] args) {
		double radiusKM = 6378;
		double radiusM = 6378 * 1.6;

		double volumeKM = (4 / 3) * Math.PI * Math.pow(radiusKM,3);		
		double volumeM = (4 / 3) * Math.PI * Math.pow(radiusM,3);
		
		System.out.println("The volume of earth in cubic kilometers is " + volumeKM + " and cubic miles is " + volumeM);
	}
}

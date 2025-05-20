public class Pens {
	public static void main (String[] args) {
		int pens = 14, students = 3;
	
		int penPerStu = pens / students;
		int remPens = pens % students;
		
		System.out.println("The Pen Per Student is " + penPerStu + " and the remaining pen not distributed is " + remPens);
	}
}

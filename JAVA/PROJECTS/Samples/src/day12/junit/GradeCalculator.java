package day12.junit;

public class GradeCalculator {
	
	public char calculateGrades(int mark1, int mark2, int mark3) {
		char grade = 'U';
		
		if(mark1 > 80 && mark2 > 80 && mark3 > 80)
			grade ='A';
		else if(mark1 > 70 && mark2 > 70 &&  mark3 > 70)
			grade = 'B';
		else if(mark1 > 60 && mark2 > 60 &&  mark3 > 60)
			grade = 'C';
		else if(mark1 > 50 && mark2 > 50 &&  mark3 > 50)
			grade = 'D';
		
			
		
		return grade;
	}

	
	public static void main(String[] args) {
		
		GradeCalculator gc = new GradeCalculator();
		System.out.println(gc.calculateGrades(85, 85, 90));
		
		System.out.println(gc.calculateGrades(35, 45, 90));
	}
}

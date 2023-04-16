package day12.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class GradeCalculatorTest {
	private GradeCalculator gc;
	@BeforeEach
	void setUp() throws Exception {
		gc = new GradeCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		gc = null;
	}

	@Test
	void testCalculateGradesAgrade() {
		assertEquals('A',gc.calculateGrades(90, 80, 90),"Check your marks, for Grade A all marks should be greater than 90.");
		//assertEquals('A',gc.calculateGrades(90, 80, 90));
		//assertEquals('U', gc.calculateGrades(50, 70, 70));
		//fail("Not yet implemented");
	}
	@Test
	void testCalculateGradesBgrade() {
		assertEquals('A',gc.calculateGrades(90, 90, 90));
		assertEquals('B',gc.calculateGrades(90, 80, 90));
		assertEquals('U', gc.calculateGrades(50, 70, 70));
		//fail("Not yet implemented");
	}
}

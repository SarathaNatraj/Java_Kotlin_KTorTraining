package day12.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		//("Not yet implemented");
	}

	@Test
	public void testFindMax(){  
        assertEquals(4,Calculator.findMax(new int[]{1,3,4,2}));  
        assertEquals(0,Calculator.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  

}

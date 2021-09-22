package JUnit_Lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private static GradeBook g1;
	private static GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		

		g2 = new GradeBook(5);
		g2.addScore(23);
		g2.addScore(15);
		g2.addScore(100);
		g2.addScore(54);
		g2.addScore(88);

	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
		
	}
	
	@Test 
	void testAddScore() {
		String testG1String = g1.toString();
		String testG2String = g2.toString();
		String g1String = " 50.0 75.0";
		String g2String = " 23.0 15.0 100.0 54.0 88.0";
		
		assertTrue(testG1String.equals(g1String));
		assertEquals(2, g1.getScoreSize());
		
		assertTrue(testG2String.equals(g2String));
		assertEquals(5, g2.getScoreSize());
				
	}

	@Test
	void testSum() {
		assertEquals(125, g1.sum());
		assertEquals(280, g2.sum());
	}
	
	@Test
	void testMinimum() {
		assertEquals(50, g1.minimum());
		assertEquals(15, g2.minimum());
	}
	
	@Test
	void testFinalScore() {
		assertEquals(75, g1.finalScore());
		assertEquals(265, g2.finalScore());

	}

}

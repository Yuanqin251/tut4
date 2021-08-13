package  foo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCalc {
	
	static Cacl testCacl = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		testCacl = new Cacl();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		testCacl = null;
	}

	@Test
	void testAdd() {
		assertEquals(testCacl.add(1, 2), 3);
	}
	
	@Test
	void testSubtrac() {
		assertEquals(testCacl.subtrac(2, 1), 1);
	}
}

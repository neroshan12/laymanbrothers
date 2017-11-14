package domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionTest {
	

	private Transaction classUnderTest;

	@BeforeEach
	public void setUp() throws Exception {
		classUnderTest = new Transaction(100);
	}

	@Test
    public void transaction() {
        assertTrue(classUnderTest instanceof Transaction);
    }
	
	@Test
	public void testGetAmount() {
		double result = 100.00;
		assertEquals(result, classUnderTest.getAmount());
	}
	
}

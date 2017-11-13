package domain;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

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
		int result = 100;
		assertEquals(result, classUnderTest.getAmount());
	}
	
}

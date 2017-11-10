package domain;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionTest extends Transaction {
	
	private Transaction classUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new Transaction();
	}

	@Test
    public void transaction() {
        assertTrue(classUnderTest instanceof Transaction);
    }
	
//Acomment
}

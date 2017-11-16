package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bank.domain.DateProvider;
import bank.domain.Transaction;
class TransactionTest {
	

	private Transaction classUnderTest;

	@BeforeEach
	public void setUp() throws Exception {
		classUnderTest = new Transaction(100.00, null, null, null);
	}

	@Test
    public void transaction() {
        assertTrue(classUnderTest instanceof Transaction);
    }
	
	@Test
	public void testGetAmount() {
		double result = 100.00;
		assertEquals(result, classUnderTest.getAmount(), 0.00);
	}
	
	@Test
	public void testGetTransactionDate() {
		Date result = DateProvider.getInstance().now();
		System.out.println(classUnderTest.getTransactionDate());
		assertThat(result, classUnderTest.getTransactionDate());
	}

	private void assertThat(Date result, Date transactionDate) {
		// TODO Auto-generated method stub
	}
	
}

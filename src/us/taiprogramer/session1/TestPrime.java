/**
 * 
 */
package us.taiprogramer.session1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author taiprogramer
 *
 */
class TestPrime {

	@Test
	void oneIsNotPrime() {
		assertFalse(Prime.isPrime(1));
	}
	
	@Test
	void twoIsPrime() {
		assertTrue(Prime.isPrime(2));
	}
	
	@Test
	void threeIsPrime() {
		assertTrue(Prime.isPrime(3));
	}
	
	@Test
	void fourIsNotPrime() {
		assertFalse(Prime.isPrime(4));
	}

}

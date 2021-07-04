package by.epamtc.dubovik.task1.logic.condition;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.task1.logic.condition.Prime;;

public class TestPrime {
	
	@Test
	public void doesSatisfyTestPrime() {
		int number = 5;
		Prime testPrime = new Prime();
		boolean expected = true;
		boolean actual = testPrime.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestSmallestPrime() {
		int number = 2;
		Prime testPrime = new Prime();
		boolean expected = true;
		boolean actual = testPrime.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestNotPrime() {
		int number = 8;
		Prime testPrime = new Prime();
		boolean expected = false;
		boolean actual = testPrime.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestNegative() {
		int number = -3;
		Prime testPrime = new Prime();
		boolean expected = false;
		boolean actual = testPrime.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
}

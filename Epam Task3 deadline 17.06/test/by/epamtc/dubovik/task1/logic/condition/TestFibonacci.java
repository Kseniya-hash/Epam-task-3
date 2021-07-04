package by.epamtc.dubovik.task1.logic.condition;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.task1.logic.condition.Fibonacci;

public class TestFibonacci {
	
	@Test
	public void doesSatisfyTestFibonnaci() {
		int number = 5;
		Fibonacci testFibonnaci = new Fibonacci();
		boolean expected = true;
		boolean actual = testFibonnaci.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestSmallestFibonnaci() {
		int number = 0;
		Fibonacci testFibonnaci = new Fibonacci();
		boolean expected = true;
		boolean actual = testFibonnaci.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestNotFibonnaci() {
		int number = 6;
		Fibonacci testFibonnaci = new Fibonacci();
		boolean expected = false;
		boolean actual = testFibonnaci.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestNegative() {
		int number = -3;
		Fibonacci testFibonnaci = new Fibonacci();
		boolean expected = false;
		boolean actual = testFibonnaci.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
}

package by.epamtc.dubovik.task1.logic;

import org.junit.Test;

import by.epamtc.dubovik.task1.entity.Array;

import org.junit.Assert;

public class TestArrayMathematic {

	@Test
	public void findPrimesTestHasPrimes() {
		Array testArray = new Array(1, 3, -9, 5, 4, 5);
		Array expected = new Array(3, 5, 5);
		Array actual = ArrayMathematic.findPrimes(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findPrimesTestHasNoPrimes() {
		Array testArray = new Array(1, 6, -9, 4);
		Array expected = new Array();
		Array actual = ArrayMathematic.findPrimes(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findPrimesTestEmpthyArray() {
		Array testArray = new Array();
		Array expected = new Array();
		Array actual = ArrayMathematic.findPrimes(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findPrimesTestNullArray() {
		Array testArray = null;
		Array expected = null;
		Array actual = ArrayMathematic.findPrimes(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findFibonacciTestHasFibonacci() {
		Array testArray = new Array(1, 3, -9, 0, 4, 5, 0);
		Array expected = new Array(1, 3, 0, 5, 0);
		Array actual = ArrayMathematic.findFibonacci(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findFibonacciTestHasNoFibonacci() {
		Array testArray = new Array(6, -3, -9, 7, 4);
		Array expected = new Array();
		Array actual = ArrayMathematic.findFibonacci(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findFibonacciTestEmpthyArray() {
		Array testArray = new Array();
		Array expected = new Array();
		Array actual = ArrayMathematic.findFibonacci(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findFibonacciTestNullArray() {
		Array testArray = null;
		Array expected = null;
		Array actual = ArrayMathematic.findFibonacci(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findNumbersWithoutRepeatsTestHasWithoutRepeats() {
		Array testArray = new Array(123, -893, 909, 100, 4315, 35, 120);
		Array expected = new Array(123, -893, 120);
		Array actual = ArrayMathematic.findNumbersWithoutRepeats(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findNumbersWithoutRepeatsTestHasNoWithoutRepeats() {
		Array testArray = new Array(122, -8493, 909, 100, 4315, 35, 20);
		Array expected = new Array();
		Array actual = ArrayMathematic.findNumbersWithoutRepeats(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findNumbersWithoutRepeatsTestEmpthyArray() {
		Array testArray = new Array();
		Array expected = new Array();
		Array actual = ArrayMathematic.findNumbersWithoutRepeats(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findNumbersWithoutRepeatsTestNullArray() {
		Array testArray = null;
		Array expected = null;
		Array actual = ArrayMathematic.findNumbersWithoutRepeats(testArray);
		Assert.assertEquals(expected, actual);
	}
}

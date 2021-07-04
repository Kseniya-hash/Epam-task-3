package by.epamtc.dubovik.task1.logic;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.task1.entity.Array;
import by.epamtc.dubovik.task1.entity.InvalidBorderException;
import by.epamtc.dubovik.task1.logic.ArraySearch;

public class TestArraySearch {
	private Array testArray = new Array(-1, 4, 5, 8, 10);
	
	@Test
	public void binarySearchTestHasElement() {
		int value = 8;
		int expected = 3;
		int actual = ArraySearch.binarySearch(testArray, value);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void binarySearchTestHasElementLowerBorder() {
		int value = -1;
		int expected = 0;
		int actual = ArraySearch.binarySearch(testArray, value);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void binarySearchTestHasElementHigherBorder() {
		int value = 10;
		int expected = 4;
		int actual = ArraySearch.binarySearch(testArray, value);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void binarySearchTestHasNoElement() {
		int value = 3;
		int expected = -1;
		int actual = ArraySearch.binarySearch(testArray, value);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void binarySearchTestEmpthyArray() {
		Array empthyArray = new Array();
		int value = 3;
		int expected = -1;
		int actual = ArraySearch.binarySearch(empthyArray, value);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void binarySearchTestNullArray() {
		Array nullArray = null;
		int value = 3;
		int expected = -1;
		int actual = ArraySearch.binarySearch(nullArray, value);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findMaxElementTestSortedArray() throws NullArrayException, InvalidBorderException {
		int expected = 10;
		int actual = ArraySearch.findMaxElement(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findMaxElementTestUnsortedArray() throws NullArrayException, InvalidBorderException {
		Array unsortedArray = new Array(5, 4, 7, -15, 8 ,1);
		int expected = 8;
		int actual = ArraySearch.findMaxElement(unsortedArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = InvalidBorderException.class)
	public void findMaxElementTestEmpthyArray() throws NullArrayException, InvalidBorderException {
		Array empthyArray = new Array();
		int actual = ArraySearch.findMaxElement(empthyArray);
	}
	
	@Test(expected = NullArrayException.class)
	public void findMaxElementTestNullArray() throws NullArrayException, InvalidBorderException {
		Array empthyArray = null;
		int actual = ArraySearch.findMaxElement(empthyArray);
	}
	
	@Test
	public void findMinElementTestSortedArray() throws NullArrayException, InvalidBorderException {
		int expected = -1;
		int actual = ArraySearch.findMinElement(testArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findMinElementTestUnsortedArray() throws NullArrayException, InvalidBorderException {
		Array unsortedArray = new Array(5, 4, -7, 5, 8 ,1);
		int expected = -7;
		int actual = ArraySearch.findMinElement(unsortedArray);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = InvalidBorderException.class)
	public void findMinElementTestEmpthyArray() throws NullArrayException, InvalidBorderException {
		Array empthyArray = new Array();
		int actual = ArraySearch.findMinElement(empthyArray);
	}
	
	@Test(expected = NullArrayException.class)
	public void findMinElementTestNullArray() throws NullArrayException, InvalidBorderException {
		Array empthyArray = null;
		int actual = ArraySearch.findMinElement(empthyArray);
	}

}

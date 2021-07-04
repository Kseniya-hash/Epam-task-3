package by.epamtc.dubovik.task2.sorting;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.task2.sorting.MaxComparator;

public class TestMaxComparator {
	
	@Test
	public void compareTestFirstMax() {
		MaxComparator testComparator = new MaxComparator();
		int[] array1 = {-3,5,2};
		int[] array2 = {1,1};
		int expected = 1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestSecondMax() {
		MaxComparator testComparator = new MaxComparator();
		int[] array1 = {-3,5,2};
		int[] array2 = {1,7, -5};
		int expected = -1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestEqual() {
		MaxComparator testComparator = new MaxComparator();
		int[] array1 = {-3,5,2};
		int[] array2 = {5,1, -3};
		int expected = 0;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestHasEmpthy() {
		MaxComparator testComparator = new MaxComparator();
		int[] array1 = {};
		int[] array2 = {1,1, -3};
		int expected = -1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestBothEmpthy() {
		MaxComparator testComparator = new MaxComparator();
		int[] array1 = {};
		int[] array2 = {};
		int expected = 0;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestHasNull() {
		MaxComparator testComparator = new MaxComparator();
		int[] array1 = null;
		int[] array2 = {1,1, -3};
		int expected = -1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestBothNull() {
		MaxComparator testComparator = new MaxComparator();
		int[] array1 = null;
		int[] array2 = null;
		int expected = 0;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
}
